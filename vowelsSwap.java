import java.util.*;
class vowelsSwap{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.next();
        int len=str.length();
        char ch[]=new char[len];
        for(int i=0;i<len;i++)
        {    
            ch[i]=str.charAt(i);
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                switch(ch[i])
                {
                    case 'e':ch[i]=;
                            break;
                }



    }
}