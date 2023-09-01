import java.util.*;
public class binary{ 
    public static void main(String[] args){ 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter binary number:");
       String s=sc.next();
       int decimal=Integer.parseInt(s,2);
       System.out.println(decimal);
    }
}