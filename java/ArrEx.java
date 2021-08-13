class ArrEx
{
  public static void main(String args[])
  {
    try
    {
      int arr[]={3,0};
      int i=arr[0]/arr[1];
    }
    catch(ArithmeticException e)
    {
      System.out.println("Division by 0 is not allowed!");
    }
    catch(Exception e)
    {
      System.out.println("Generic Exception");
    }
  }
}
