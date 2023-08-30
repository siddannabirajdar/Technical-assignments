import java.util.Scanner;

public class deffOfSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int Dsum=0,NDsum=0;
        for (int i = 1; i <= m; i++) {
            if(i%n==0)
                 Dsum+=i;
            else
                NDsum+=i;
        }
        System.out.println(NDsum-Dsum);
    }
}
