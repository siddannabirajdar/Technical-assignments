abstract class BankBalance
{
    abstract void getBalance();
}
class bankA extends BankBalance
{
    void getBalance()
     {
        System.out.println("Bank-A Balance:100");
     }
}
class bankB extends BankBalance
{
    void getBalance()
     {
        System.out.println("Bank-B Balance:150");
     }
}
class bankC extends BankBalance
{
    void getBalance()
     {
        System.out.println("Bank-C Balance:200");
     }
}
class bank
{
    public static void main(String args[]) 
    {
        BankBalance b;
        b=new bankA();
        b.getBalance();
        b=new bankB();
        b.getBalance();
        b=new bankC();
        b.getBalance();
    }
}