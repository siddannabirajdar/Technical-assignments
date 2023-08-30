import java.util.Arrays;
import java.util.Scanner;

public class baseNotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=sc.nextInt();
        int a[]=new int[n];
        dectoNbase(n,num);
    }
    public static void dectoNbase(int n,int num){
        int rem,res;
        StringBuilder s=new StringBuilder();
        while(num!=0){
            rem=num%n;
            if(rem>9){
                s.append((char)(rem+55));
            }
            else{
                s.append(rem);
            }
            res=num/n;
            num=res;
        }
        System.out.println(s.reverse());
    } 
}