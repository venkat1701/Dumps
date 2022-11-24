import java.util.*;
import java.util.concurrent.*;
class Queue_Eg_PQueue
{
    public static void main()
    {
        Queue<Employee> emp=new LinkedList<>();
        Employee e1=new Employee("Aryan Jaiswal",20000);
        Employee e2=new Employee("Krish Jaiswal",10000);

        emp.add(e1);
        emp.add(e2);
        for(Employee employ:emp)
        {
            System.out.println(employ);
        }
    }
}
class Employee
{
    String nameEmp;
    Integer salary;
    Employee(String name,Integer Salary)
    {
        this.nameEmp=name;
        this.salary=Salary;
    }
    @Override
    public String toString()
    {
        String result="Name: "+this.nameEmp+", Salary: $"+this.salary;
        return result;
    }
}