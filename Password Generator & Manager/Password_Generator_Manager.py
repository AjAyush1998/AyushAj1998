# Create of Master User and save Passwords. After Creation of Master User, you
# add your username and passwords along with websites on which you have made
# your account and want to store the data.
import sqlite3
import string
import secrets

database = sqlite3.connect('master_database.db')
cur = database.cursor()


def choices():
    print("1. Add new Master User")
    print("2. Login as Master User")
    print("3. Change Your Master User Password")
    print("4. Delete your Master User Data")


def password_generator():
    password = ''.join(secrets.choice(string.ascii_letters+string.digits+string.punctuation) for i in range(10))
    return password


choices()
instruct_choice = int(input("Enter your choice:"))
choice = [1, 2, 3, 4]
if instruct_choice not in choice:
    print("Wrong Choice! Please Read your Instructions again..")
    choices()
else:
    if instruct_choice == 1:
        cur.execute('''CREATE table IF NOT EXISTS master_user (MasterUserName,Password)
            Primary Key (MasterUserName)''')
        master_user_name = input("Enter Master Username without space:")
        print("Do you want to generate a new password. YES or NO")
        gen_pass = input("Enter your Choice:")
        password_list = []
        password = ''
        choice = 0
        if gen_pass.upper() == 'YES':
            for i in range(5):
                a = password_generator()
                password_list.append(a)
            for i in password_list:
                print(password_list.index(i)+1, " ", i)
            choice_of_password = int(input("Enter the serial number of Password:"))
            password = password_list[choice_of_password-1]
        elif gen_pass.upper() == 'NO':
            password = input("Enter your master password (should be in range 8-14 characters):")
            print(password)
        print("Master Username:{} \nMaster Password:{}".format(master_user_name, password))
        save_choice = input("Do you want to save your password? (YES or NO)")
        if save_choice.upper() == 'YES':
            cur.execute("INSERT INTO master_user values(?,?)", (master_user_name, password))
            database.commit()
            filename = "master_user_" + master_user_name
            password_file = open(filename, "w")
            password_file.write("Password:{}".format(password))
        else:
            exit()
    elif instruct_choice == 2:
        print("\n\t\tWelcome to Login Section!\n\n")
        input_master_username = input("Enter your Master Username:")
        input_master_password = input("Enter your Master Password:")
        cur.execute('''SELECT Password FROM master_user where MasterUserName = ?''', (input_master_username,))
        password_list = cur.fetchone()
        password = password_list[0]
        curr = database.cursor()
        if password == input_master_password:
            print("Welcome Master User \"{}\"\n\n".format(input_master_username))
            print("How Can I Help You Today?")
            print("1. Enter New Username, Password, Website")
            print("2. Change Password")
            print("3. Delete Username, Password, Website data")
            print("4. Display All Details of the Master User")
            second_choice = int(input("Enter your choice:"))
            curr.execute('''Create Table IF NOT EXISTS username_database (
                MasterUserName varchar2 NOT NULL,
                Username varchar2 NOT NULL,
                Password varchar2 NOT NULL,
                Website varchar2)
                Primary Key (MasterUserName,Username)
                Foreign Key (MasterUserName)''')  # Add MasterUserName as Foreign Key
            if second_choice == 1:
                new_username = input("Enter new Username:")
                password_choice = input("Do you want to generate new password? YES or NO:")
                new_password = ''
                if password_choice.upper() == 'YES':
                    new_password = password_generator()
                elif password_choice.upper() == 'NO':
                    new_password = input("Enter you password:")
                new_website = input("Enter website link for Credentials Storage(YOU CAN KEEP IT Empty):")
                print("New Username:{}\nNew Password:{}\nWebsite link provided:{}".format(new_username,
                                                                                          new_password, new_website))
                curr.execute('''INSERT INTO username_database (MasterUserName, Username, Password, Website)
                    values(?,?,?,?)''', (input_master_username, new_username, new_password, new_website))
                database.commit()
            elif second_choice == 2:
                username_ = input("Enter your Username to change Password for:")
                old_password = input("Enter your current password:")
                curr.execute('''Select password from username_database where MasterUserName=? and Username=?''', (
                    input_master_username, username_,))
                password_l = curr.fetchone()
                password_ = password_l[0]
                if old_password == password_:
                    print("Password Matched!")
                    choice_ = input("Do you want to generate Password?(YES or NO)")
                    new_password = ''
                    if choice_.upper() == 'YES':
                        new_password = password_generator()
                    else:
                        new_password = input("Enter your new password:")
                    filename = "master_user_"+input_master_username+"_username_"+username_
                    password_file = open(filename, "w")
                    password_file.write("Password:{}".format(new_password))
                    curr.execute('''update username_database set password=? where MasterUserName=?
                        and Username=?''', (new_password, input_master_username, username_))
                    database.commit()
                    print("Successfully Updated your Password")
                    curr.execute('''Select * from username_database where MasterUserName=? and Username=?''', (
                        input_master_username, username_,))
                    details = curr.fetchone()
                    print("MasterUserName:{}\nUsername:{}\nPassword:{}\nWebsite:{}".format(
                        details[0], details[1], details[2], details[3]))
            elif second_choice == 3:
                print("Enter your Details to be Deleted:")
                username = input("Enter your username:")
                password = input("Enter your password:")
                curr.execute('''Select * from username_database where MasterUserName=? and Username=?
                    and Password=?''', (input_master_username, username, password))
                details = curr.fetchone()
                print("Your details have been matched!\nUsername:\t{}\nPassword:\t{}\nWebsite:\t{}".format(
                    details[1], details[2], details[3]))
                curr.execute('''Delete from username_database where MasterUserName=? and Username=?
                    and Password=?''', (input_master_username, username, password))
                database.commit()
                print("\nThe above Displayed Details have been deleted successfully!\n")
            elif second_choice == 4:
                curr.execute('''Select Username, Password, Website from username_database where
                    MasterUserName=?''', (input_master_username,))
                details = curr.fetchall()
                for i in details:
                    print("\nUsername:\t{}\nPassword:\t{}\nWebsite:\t{}\n".format(i[0], i[1], i[2]))
    elif instruct_choice == 3:
        master_username = input("Enter Your Master Username:")
        master_password = input("Enter Your Password:")
        cur.execute('''SELECT Password FROM master_user where MasterUserName = ?''', (master_username,))
        password_list = cur.fetchone()
        password = password_list[0]
        if password == master_password:
            print("Password Matched!")
            choice = input("Do you want to generate a new password? (YES or NO)")
            new_password = ''
            if choice.upper() == 'YES':
                new_password = password_generator()
            else:
                new_password = input("Enter your new password:")
            filename = "master_user_"+master_username
            password_file = open(filename, "w")
            password_file.write("Password:{}".format(new_password))
            cur.execute('''update master_user set password=? where MasterUserName=?''', (new_password, master_username))
            database.commit()
            print("Successfully Updated your Password")
    elif instruct_choice == 4:
        master_username = input("Enter Your Master Username:")
        master_password = input("Enter Your Password:")
        cur.execute('''SELECT Password FROM master_user where MasterUserName = ?''', (master_username,))
        password_list = cur.fetchone()
        password = password_list[0]
        if password == master_password:
            print("Password Matched!")
            cur.execute('''Delete from master_user where MasterUserName=? and Password=?''', (
                master_username, master_password))
            database.commit()
            print("Master Username and Password Deleted Successfully!")
    else:
        print("Invalid Password. Retry!")
