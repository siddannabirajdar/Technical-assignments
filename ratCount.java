import java.util.Scanner;

public class ratCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int res=r*unit;
        int index=0,amount=0;
        for (int i = 0; i < n; i++) {
            amount+=a[i];
            if(amount>=res){
                index=i+1;
                break;
            }
        }
        System.out.println(index);
    }
}