import java.util.*;
public class ladduChor{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n+1];
        for(int i=0;i<=n;i++){
            s[i]=sc.nextLine();
        }
        int count;
        String temp;
        String thief="";
        int max=0,k=-1;
        for(int i=0;i<=n;i++)
        {
            temp=s[i];
            count=0;
           for(int j=0;j<temp.length();j++)
           {
            if(temp.charAt(j)=='a'||temp.charAt(j)=='A'||temp.charAt(j)=='e'||temp.charAt(j)=='E'||temp.charAt(j)=='i'||temp.charAt(j)=='I'||temp.charAt(j)=='o'||temp.charAt(j)=='O'||temp.charAt(j)=='u'||temp.charAt(j)=='U' ){
                    count++;
            }
          }
          if(count>max)
          {
            max=count;
            k++;
            thief=temp;
          }
        }
        System.out.println(thief);
    }
}
