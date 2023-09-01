import java.util.*;
class RowSum 
{
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        n=SC.nextInt();
        m=SC.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter elements");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=SC.nextInt();
            }
        }
        System.out.println("matrix is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            int sum=0;
            for(j=0;j<m;j++)
            {
                sum+=a[i][j];
            }
            System.out.println("Sum of Row"+(i+1)+":"+sum);
        }
    }
    
}
