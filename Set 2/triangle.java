import java.util.*;
class triangle
{   //start of class block
public static void main(String args[])
{   //start of main() method
Scanner sc=new Scanner(System.in);    //making object of Scanner class
System.out.println("Enter the Three sides of the Triangle one by one");
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
if((s1+s2)>s3 || (s2+s3)>s1 || (s3+s1)>s2)
{
if((s1==s2)&&(s1==s3))
System.out.println("Equilateral triangle");
else if((s1!=s2 && s1==s3) || (s2!=s3 && s2==s1) || (s3!=s1 && s3==s2))
System.out.println("Isosceles Triangle");
else
System.out.println("Scalene Triangle");
}
else
System.out.println("No Triangle Possible");
}
}
