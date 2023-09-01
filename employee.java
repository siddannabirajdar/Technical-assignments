import java.util.*;
class Details
{
    int BasicSalary;
    long id;
    String name;
    int Allowances;
    int net;
    Scanner SC=new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name of Employee");
        name=SC.next();
        System.out.println("Enter id of Employee");
        id=SC.nextLong();
        System.out.println("Enter Basic salary of Employee");
        BasicSalary=SC.nextInt();
        System.out.println("Enter other Allowances of Employee");
        Allowances=SC.nextInt();
    }
    void calnet()
    {
        net=BasicSalary+Allowances;
    }
    void display()
    {
        System.out.println("NAME:"+name+"\nId:"+id+"\nNet Salary:"+net); 
    }
}
class employee 
{
   public static void main(String args[])
   {
        Details d=new Details();
        d.read();
        d.calnet();
        d.display();
   }
}