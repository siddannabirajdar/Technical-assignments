import java.util.Scanner;

public class binaryNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int res=s.charAt(0)-'0';
        for (int i = 1; i < n; i+=2) {
            if(s.charAt(i)=='A')
            {
                res &=(s.charAt(i+1)-'0');
            }
            if(s.charAt(i)=='B')
            {
                res |=(s.charAt(i+1)-'0');
            }
            if(s.charAt(i)=='C')
            {
                res ^=(s.charAt(i+1)-'0');
            }   
        }
        System.out.println(res);
    }
       
}
