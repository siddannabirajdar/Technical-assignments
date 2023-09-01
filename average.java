import java.util.Scanner;
class average 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int n=sc.nextInt();
        int sum=0;
        for(int i:n)
        {
            if(i%2==0)
            {
                sum+=i;
            }
            if(n==0)
            {
                break;
            }
            n=n-1;
        }
        System.out.println(sum);
    }
}
