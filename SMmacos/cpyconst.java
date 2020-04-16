class Cpyconst
{
    int a,b,c;
    Cpyconst(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void show()
    {
        System.out.println(a+"..."+b+"..."+c);
    }
    Cpyconst(Cpyconst t)  // Cpyconst t is a Reference not object;
    {
        a=t.a;
        b=t.b;
        c=t.c;
    }
    public static void main(String args[])
    {
        Cpyconst t1=new Cpyconst(10,20,30);
        Cpyconst t2=new Cpyconst(t1);
        t1.show();
        t2.show();
    }
}
