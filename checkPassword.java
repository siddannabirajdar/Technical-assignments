import java.util.Scanner;

public class checkPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int count=0;
        System.out.println(check(s, n));
    }
    public static int check(String s,int n)
    {
        if(n<4){
           return 0;
        }
        if(s.charAt(0)>='0' && s.charAt(0)<='9'){
          return 0;
        }
        int cap=0,digit=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                cap++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
                digit=1;
            else if(s.charAt(i)=='/' || s.charAt(i)==' ')
                return 0;
            }
        if(cap>0 && digit>0)
            return 1;
        else
            return 0;
    }     
}
