import java.util.*;
class palindrome1
{
    public static void main(String args[])
    {
    Scanner SC=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=SC.next();
    StringBuilder sb=new StringBuilder();
    sb.append(str);
    sb.reverse();
    String rev=sb.toString();  
    if(str.equals(rev)){  
        System.out.println("true");  
    }
    else{  
        System.out.println("false");  
    }  
}  
}
