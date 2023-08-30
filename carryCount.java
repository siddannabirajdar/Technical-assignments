import java.util.Scanner;

public class carryCount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int rem1,rem2;
        if(n1==0 || n2==0){
            System.out.println("1");
            System.exit(0);
        }
        int count=0;
        while(n1!=0 || n2!=0){
            int l=0;
            rem1=n1%10;
            rem2=n2%10;
            l=rem1+rem2+count;
            if(l>9)
            {
                count++;
            }
            n1=n1/10;
            n2=n2/10;
        }
        System.out.println(count);
    }
}