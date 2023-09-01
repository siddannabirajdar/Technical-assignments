import java.util.*;
class digit
{
    public static void main(String args[])
    {
        int n,sum=0,b=0;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        n=SC.nextInt();
        while(n>10)
        {
            b=n%10;
            sum=sum+b;
            n=n/10;
        }
        sum=sum+n;
        System.out.println("Result is:"+sum);
    }
}