import java.util.*;
class vowelR
{
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your name");
        String s=SC.next();
        s=s.replaceAll("[AaEeIiOoUu]","");
        System.out.println("Enter surname");
        String l=SC.next();
        System.out.println(s+l);
    }
    
}
