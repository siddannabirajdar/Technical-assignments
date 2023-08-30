import java.util.Arrays;
import java.util.Scanner;

public class largeSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int a[]=new int[n];
       for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();        
       }
        if(n<3){
          System.out.println("0");
          System.exit(0);
        }
        Arrays.sort(a);
        int Osum=0,Esum=0;
        if(n%2==0){
            Osum=a[3];
            Esum=a[n-4];
            System.out.println(Osum+Esum);
        }
       else{
            Osum=a[3];
            Esum=a[n-3];
            System.out.println(Osum+Esum);
       }
    }     
}