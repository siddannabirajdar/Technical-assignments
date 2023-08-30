#include<stdio.h>
#include<math.h>
void main()
{
    int i=0,dec=0,base=8;
    int n,digit;
    scanf("%d",&n);
    while(n!=0)
    {
        digit=n%10;
        dec+=digit*pow(8,i);
        n=n/10;
        i++;
    }
    printf("%d",dec);
}