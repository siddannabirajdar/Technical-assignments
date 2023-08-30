import java.util.*;
class occurance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        // for (int i = 0; i<n; i++) {
        //     if(i==0 || a[i]!=a[i-1])
        //     {
        //     System.out.print(a[i]+" ");
        //     }
        // }
        for (int i=0; i<n; i++)
        {
            int j;
            for (j=0; j<i; j++)
            if (a[i] == a[j])
                break;
            if (i == j)
                System.out.print(a[i]+" ");
        }
    }
}