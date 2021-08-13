class MessageT{
synchronized void mess1()
{
  System.out.println("Hello There!");
  System.out.println("Waiting For Response..");
}
synchronized void mess2()
{
  System.out.println("Hello Back!");
  notify();
  }
}

class Message
{
  public static void main(String args[])
  {
    final MessageT c=new MessageT();
    new Thread(){
    public void run(){c.mess1();}
  }.start();
  new Thread()
  {
    public void run(){c.mess2();
  }
}.start();
}
}
