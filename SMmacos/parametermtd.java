class Paramethod
{
    int a,b,c;
    void show()
    {
        System.out.println( a+"..."+b+"..."+c);
    }
    void getData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    public static void main(String args[])
    {
        Paramethod t1=new Paramethod();
        Paramethod t2=new Paramethod();
        t1.getData(10,20,30);
        t2.getData(100,200,300);
        t1.show();
        t2.show();
    }
}
