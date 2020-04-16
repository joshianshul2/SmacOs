class A
{
    int a,b,c;
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class B extends A
{
    void setData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
}


class Inherparameter
{
    public static void main(String[] args)
    {
        B b1=new B();
        B b2=new B();
        b1.setData(10,20,30);
        b2.setData(100,200,300);
        b1.show();
        b2.show();
        
        
    }
}
/* o/p:
 10 20 30
 100 200 300
 */
