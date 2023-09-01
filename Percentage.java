import java.util.*;
abstract class Marks
{
    int a1,a2,a3,b1,b2,b3,b4;
    public Marks(int a1,int a2,int a3)
    {
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
    public Marks(int b1,int b2,int b3,int b4)
    {
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
        this.b4=b4;
    }
    abstract void getPercentage();
}
class A extends Marks
{
     public A(int a1,int a2,int a3)
    {
        super(a1,a2,a3);
    }
    void getPercentage()
     {
        System.out.println("Total percentage:"+(a1+a2+a3)/3);
     }
}
class B extends Marks
{
    public B(int b1,int b2,int b3,int b4)
    {
        super(b1,b2,b3,b4);
    } 
    void getPercentage()
     {
        System.out.println("Total percentage:"+(b1+b2+b3+b4)/4);
     }
}
class Percentage
{
    public static void main(String args[]) 
    {
        Scanner SC=new Scanner(System.in);
        Marks m;
        System.out.println("Enter marks obtained by student A");
        int a1=SC.nextInt();
        int a2=SC.nextInt();
        int a3=SC.nextInt();
        m=new A(a1,a2,a3);
        m.getPercentage();
        System.out.println("Enter marks obtained by student B");
        int b1=SC.nextInt();
        int b2=SC.nextInt();
        int b3=SC.nextInt();
        int b4=SC.nextInt();
        m=new B(b1,b2,b3,b4);
        m.getPercentage();

    }
}
