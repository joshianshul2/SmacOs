class Paraconst
{
    int a,b,c;
    Paraconst(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    Paraconst()
    {
    }
    void show()
    {
        System.out.println(a+"..."+b+"..."+c);
    }
    public static void main(String args[])
    {
        Paraconst t1=new Paraconst(10,20,30);
        Paraconst t2=new Paraconst(100,200,300);
        t1.show();
        t2.show();
        Paraconst t3=new Paraconst();
        t3.show();
    }
}
