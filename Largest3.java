import java.util.*;
class Largest3
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=SC.nextInt();
        b=SC.nextInt();
        c=SC.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
    }
    
}
