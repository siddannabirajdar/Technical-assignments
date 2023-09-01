import java.lang.Thread;
class first extends Thread
{
   public void run()
   {
        try
        {
           while(true)
            {
                //System.out.println("MITE");
                second s=new second();
                first.sleep(1000);
                System.out.println("MITE");
                s.start();
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("EXCEPTION OCCURED");
        }
   }
}
class second extends Thread
{
    public void run()
    {
        System.out.println("MOODABIDRI");
    }
}
class Tdemo
{
    public static void main(String[] args)
    {
        first f=new first();
        f.start();
    }
}


