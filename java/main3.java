import java.util.*;
import java.io.*;
class employee
{
    private String FirstName,LastName;
    private String emailID,contactNum;
    private long EmpNumber;
    private int  Attendence;

    employee(String FirstName, String LastName, int Attendence)
    {
       Random rand = new Random();
       this.FirstName  = FirstName;
       this.LastName   = LastName;
       this.EmpNumber  = Long.parseLong("0331214789" + Integer.toString(rand.nextInt(1000)));
       this.contactNum = "+91-" + "9"+ Integer.toString(rand.nextInt(683)  + 100) +
                                       Integer.toString(rand.nextInt(144)  + 100) +
                                       Integer.toString(rand.nextInt(100)  + 1)   +
                                       Integer.toString(rand.nextInt(10));
       
       this.emailID    = this.FirstName.toLowerCase() + Integer.toString(rand.nextInt(100)) + "@gmail.com";
       this.Attendence = Attendence;
    }
    
    double getTotalWorkinHours(double HoursWorked)
    {
        return (double)(HoursWorked * this.Attendence);
    }

    String getFullName()                  { return this.FirstName + " " + this.LastName;  }    
    Long   getEmployeeNum()               { return this.EmpNumber;  }
    int    getTotalNumberOfAttendedDays() { return this.Attendence; }
    String getPersonalInfo(char choice) 
    { 
        return choice == 'p' ? this.contactNum : this.emailID;
    } 
}

class OvertimeCalculator
{
    int NumOfWorkingDaysInAMonth;
    OvertimeCalculator(int NumOfWorkingDaysInAMonth) { this.NumOfWorkingDaysInAMonth = NumOfWorkingDaysInAMonth; }
    
    double getMonthySalary(int SalRatePerHour, int NumOfDaysAttended)
    {
        /* Office Timing from 9:00 AM to 5:15 PM */
        /* Therefore,normal working hours = 9 hours 15 mins*/
        return SalRatePerHour * 9.25 * NumOfDaysAttended;
    }

    double getOvertimePay(int SalRatePerHour , int NumOfDaysAttended, double TotalNumberOfWorkedHours)
    {
        return SalRatePerHour * (TotalNumberOfWorkedHours - (9.25 * NumOfDaysAttended));
    }
}

class main3
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Number Of Working Days In A Month: ");
        int days = Integer.parseInt(System.console().readLine());
        System.out.println("Enter Average Number Of Hours Worked In A Month: ");
        int avg_work = Integer.parseInt(System.console().readLine());
        System.out.println("Employee FirstName || Employee LastName || Number Of Days Attended Office "+days+" days");
        OvertimeCalculator otc = new OvertimeCalculator(days);
        employee emp = new employee(scan.next(),
                                    scan.next(),
                                    scan.nextInt());
        scan.close();
        System.out.println("Employee Name\t\t: "    +emp.getFullName());
        System.out.println("Monthy Salary\t\t: "    +otc.getMonthySalary(220,emp.getTotalNumberOfAttendedDays())+ 
                            " INR");
        System.out.println("Overtime pay\t\t: "     +otc.getOvertimePay(220,emp.getTotalNumberOfAttendedDays(),emp.getTotalWorkinHours(avg_work))+        " INR");
        System.out.println("Employement Number\t: " + emp.getEmployeeNum());
        System.out.println("Total Work Hours\t: "   + emp.getTotalWorkinHours(10) + " Hours In A Month");
        System.out.println("e-mail ID\t\t: "        + emp.getPersonalInfo('e'));
        System.out.println("Contact Number\t\t: "   + emp.getPersonalInfo('p'));
    }
}