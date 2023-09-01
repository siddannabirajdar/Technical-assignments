class forEach 
{
    public static void main(String args[])
    {
        int sum=0;
        int[] nums=new int []{1,2,3,4,5,6,7,8,9,10};
        for(int x:nums)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
}
