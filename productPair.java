import java.util.Arrays;
import java.util.Scanner;

public class productPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();        
        }
        if(n<2)
        {
            System.out.println("-1");
            System.exit(0);
        }
        Arrays.sort(a);
        int least1,least2=0;
        least1=a[0];
        for(int i=1;i<=n;i++){
            if(a[i]!=least1)
            {
                least2=a[i];
                break;
            }
        }
        if((least1+least2)<=sum){
            System.out.println(least1*least2);
        }
        else{
            System.out.println("0");
        }
    } 
}