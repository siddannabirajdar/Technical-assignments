import java.util.*;
public class coupon {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        String temp;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                temp=s[i]+s[j];
                if(temp.contains("0") && temp.contains("1")&&temp.contains("2")&&temp.contains("3")&&temp.contains("4")&&temp.contains("5")&&temp.contains("6")&&temp.contains("7")&&temp.contains("8")&&temp.contains("9")){
                    count++;
                }
                
            }
        }
        System.out.println(count);
    }
}
