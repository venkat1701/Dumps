import java.util.*;
class day_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character");
char ch=sc.next().charAt(0);
switch(ch)
{
case '1':
case '2':
case '3':
case '4':
case '5':
case '6':
case '7':
case '8':
case'9': System.out.println("Digits");
break;
default: System.out.println("Entered character is not a digit.");
}
}
}