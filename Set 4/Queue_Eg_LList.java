import java.util.*;
class Queue_Eg_LList
{
    public static void main(String[] args)
    {
        Queue<Customer> queue= new LinkedList<>();
        Customer cust1=new Customer("Maria Jones",10);
        Customer cust2=new Customer("Aryan Rohnta",12);
        queue.add(cust1);
        queue.add(cust2);
        int i=0;
        for(Customer obj:queue)
        {
            i++;
            System.out.println("Customer "+i+" Hash Code:"+ obj.toString());
        }        
    }
}
class Customer
{
    String name;
    Integer age;
    Customer(String cusName,Integer age)
    {
        this.name=cusName;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return name;
    }
}