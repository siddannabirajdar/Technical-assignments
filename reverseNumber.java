import java.util.Scanner;
public class reverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        String s=n.toString();
        StringBuilder res=new StringBuilder();
        res.append(s);
        System.out.println(res.reverse());
    }
}
