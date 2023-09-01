import java.util.*;
class largest
{
    public static void main(String args[])
    {
        int a,b;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=SC.nextInt();
        b=SC.nextInt();
        while(a<b)
        {
            System.out.println(b+" is greater");
            System.exit(0);
        }
        System.out.println(a+" is greater");
    }
}
