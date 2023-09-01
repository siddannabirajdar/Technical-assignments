import java.util.*;
class calci
{
    int i,j;
    void solve(int n,int a[],int b[])
    {
        int sum1=0,sum2=0,sum3=0,sum4=0,sum5=0,sx=0,sy=0;
        int x[]=new int[10];
        int p[]=new int[10];
        int q[]=new int[10];
        int r[]=new int[10];
        int s[]=new int[10];
        for(i=1;i<=n;i++)
        {
            sx+=a[i];
            sy+=b[i];
        }
        for(i=1;i<=n;i++)
        {
            x[i]=(a[i]*b[i]);
            sum1+=x[i];
        }
        for(i=1;i<=n;i++)
        {
            s[i]=(a[i]*a[i])*b[i];
            sum5+=s[i];
        }
        for(i=1;i<=n;i++)
        {
            p[i]=(a[i]*a[i]);
            sum2+=p[i];
        }
        for(i=1;i<=n;i++)
        {
           q[i]=(a[i]*a[i]*a[i]);
            sum3+=q[i];
        }
        for(i=1;i<=n;i++)
        {
            r[i]=(a[i]*a[i]*a[i]*a[i]);
            sum4+=r[i];
        }
        System.out.println("x\ty\txy\tx^2\tx^3\tx^4\tx^2y");
        for(i=1;i<=n;i++)
        {
            System.out.println(a[i]+"\t"+b[i]+"\t"+x[i]+"\t"+p[i]+"\t"+q[i]+"\t"+r[i]+"\t"+s[i]);
        }
        System.out.println("n="+n);
        System.out.println("sum(x)="+sx);
        System.out.println("sum(y)="+sy);
        System.out.println("sum(xy)="+sum1);
        System.out.println("sum(x^2)="+sum2);
        System.out.println("sum(x^3)="+sum3);
        System.out.println("sum(x^4)="+sum4);
        System.out.println("sum(x^2y)="+sum5);
    }
}
class curve
{
    public static void main(String args[])
    {
        
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter count of numbers");
        n=sc.nextInt();
        int a[]=new int[10];
        int b[]=new int[10];
        System.out.println("Enter x values");
        for(i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter y values");
        for(i=1;i<=n;i++)
        {
            b[i]=sc.nextInt();
        }
        calci c=new calci();
        c.solve(n,a,b);

    }
}