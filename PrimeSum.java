class PrimeSum 
{
    public static void main(String args[])
    {
        int sum=28,i;
        for(i=10;i<100;i++)
        {
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0&&i%11!=0)
            {
                    sum=sum+i;
            }
        }
        System.out.println(sum);
    }

}
