import java.util.*;
abstract class Shape
{
    int l,b,r,s;
    public Shape(int l,int b,int s,int r)
    {
        this.l=l;
        this.b=b;
        this.s=s;
        this.r=r;
    }
    abstract void RectangleArea();
    abstract void SquareArea();
    abstract void CircleArea();
    
}
class area1 extends Shape
{
    public area1(int l,int b,int s,int r)
    {
        super(l,b,s,r);
    }
    void RectangleArea()
    {
        System.out.println("Area of Rectangle:"+(l*b));
    }
    void SquareArea()
    {
        System.out.println("Area of Square:"+(s*s));
    }
    void  CircleArea()
    {
    System.out.println("Area of Circle:"+(3.142*r*r));
    }
}
class AREA
{
    public static void main(String args[])
    {
        Scanner SC=new Scanner(System.in);
        Shape sh;
        System.out.println("Enter length and breadth");
        int l=SC.nextInt();
        int b=SC.nextInt();
        System.out.println("Enter side");
        int s=SC.nextInt();
        System.out.println("Enter radius");
        int r=SC.nextInt();
        sh=new area1(l,b,s,r);
        sh.RectangleArea();
        sh.SquareArea();
        sh.CircleArea();

    }
}
