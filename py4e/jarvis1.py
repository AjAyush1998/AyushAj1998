import pyttsx3
import datetime
engine=pyttsx3.init()
def speak(Audio):
    engine.say("I'm JARVIS!")
    engine.say('Ayush Jaiswal is my maker!')
    engine.runAndWait()

def time():
    Time=datetime.datetime.now().strftime("%H:%M:%S")
    speak("The Current time is:")
    speak(Time)
    
time()
