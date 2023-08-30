import java.util.Scanner;

public class findCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int flag=0;
        int num=sc.nextInt();
        int diff=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(Math.abs(num-arr[i])<=diff){
                flag=1;
                count++;
            }
        }
        if(flag==1){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
    }
}
