class Defmethod
{
    int a,b,c;
    void show()
    {
        System.out.println( a+"..."+b+"..."+c);
    }
    public static void main(String args[])
    {
        Defmethod j1=new Defmethod();
        Defmethod j2=new Defmethod();
        j1.a=10;
        j1.b=20;
        j1.c=30;
        j2.a=100;
        j2.b=200;
        j2.c=300;
        j1.show();
        j2.show();
    }
}
