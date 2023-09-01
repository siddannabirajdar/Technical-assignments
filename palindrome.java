import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        int n,s;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number");
        n=SC.nextInt();
        int rem,sum=0;
        s=n;
        while(n!=0)
        {
                rem=n%10;
                sum=sum*10+rem;
                n=n/10;
        }
        if(s==sum)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
    
}