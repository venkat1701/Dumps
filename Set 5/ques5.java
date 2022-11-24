class ques5
{
  public static void main(String args[])
  {
    double n1 = 12.85,n2 = 7.19,n3 = 3.65;
    int i1 = (int) n1;
    int i2 = (int) n2;
    int i3 = (int) n3;
    double d1 = n1-i1;
    double d2 = n2-i2;
    double d3 = n3-i3;
    double x = (i1*i2*i3)/(d1+d2+d3);
    System.out.println ("The value of X is : "+x);
  }
}