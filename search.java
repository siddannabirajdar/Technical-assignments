import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        int key,n,flag=0;
        System.out.println("Enter no of elements");
        n=SC.nextInt();
        int a[]=new int[n];
        System.out.println("Enter  elements");
        for(int i=0;i<n;i++)
        {
            a[i]=SC.nextInt();
        }
        System.out.println("Enter key element");
        key=SC.nextInt();
        for(int i=0;i<n;i++)
        {
            if(key==a[i])
            {
            flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("search is succussfull");
        }
        else
        {
            System.out.println("search is unsuccussfull");
        }
    }
}