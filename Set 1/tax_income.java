import java.util.Scanner;      //Importing Scanner class from java.util package.
class tax_income
{
public static void main(String args[])    
{    //start of main() method
Scanner sc=new Scanner(System.in);     //creating object of Scanner class.
double tax_on_inc=0.0D;
System.out.println("Enter the Name of the Person");  
String name=sc.nextLine();    //accepting the name of the user.
System.out.println("Enter the Age of the Person");  
int age=sc.nextInt();    //accepting the age of the user.
System.out.println("Enter the taxable income of the Person");  
int inc=sc.nextInt();    //accepting the income of the user.
if(age<=60)   //checking if age is less than or equal to 60.
{   //start of outer if.
if(inc<=250000)    
tax_on_inc=0.0;
else if(inc>250000 && inc <=500000)
tax_on_inc=(inc-160000)*0.10;
else if(inc>500000 && inc <=1000000)
tax_on_inc=(inc-500000)*0.20+34000;
else
tax_on_inc=(inc-1000000)*0.30+94000;
System.out.println("The name of Person : "+name);
System.out.println("Age of Person : "+age);
System.out.println("Tax on his income of Rs"+inc+" is Rs. "+tax_on_inc);
}    //end of outer if.
else
System.out.println("Age is Above 60, so no taxable income to be charged");
}   //end of main() method.
} // end of class