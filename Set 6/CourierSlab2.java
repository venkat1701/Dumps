import java.util.Scanner;

class Bill

{

String n;

double w, charge=0.0, tot_charge=0.0;

public void accept(String name, double weight)

{

       n=name;

       w=weight;

}  

public void calculate()

{

 if(w<=10)

 {

  charge=25*w;

  tot_charge=charge+0.05*charge;

 }

 if(w>10 && w<=30)

 {

  charge=20*w;

  tot_charge=charge+0.05*charge;

 }

 if(w>30)

 {

  charge=10*w;

  tot_charge=charge+0.05*charge;

 }

}

public void print()

{

 System.out.println("Name");

 System.out.println("\t\t");

 System.out.println("Weight");

 System.out.println("\t\t");

 System.out.println("Bill amount");

 System.out.println("\n");

 System.out.println(n + "\t\t");

 System.out.println(w + "\t\t");

 System.out.println(tot_charge + "\n");

}

}

class Final_bill

{

public static void main(String[] args)

{

 String s;

 double wt;

 Scanner sc=new Scanner(System.in);

 System.out.println("Enetr the name of the customer: ");

 s=sc.nextLine();

 System.out.println("Enetr the weight of the parcel: ");

 wt=sc.nextDouble();

 Bill bill_obj=new Bill();

 bill_obj.accept(s, wt);

 bill_obj.calculate();

 bill_obj.print();

}

}