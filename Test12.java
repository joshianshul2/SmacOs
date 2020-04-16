import mypkg2.Second;
class child extends Second
{
    void show1();
}
class Test12
{
    public static void main(String []args)
    {
    Second t1=new Second();
        t1.show();
        t1.show1();
    }
}

