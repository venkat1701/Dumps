class ques9
{
  public static void main(int n)
  {
    int r = n%5;
    if(r == 0)
      System.out.println ("The number "+n+" is divisible by 5");
    else
      if(r>2)
        System.out.println ("The nearest number is "+(n-r+5));
      else
        System.out.println ("The nearest number is "+(n-r));
  }
}