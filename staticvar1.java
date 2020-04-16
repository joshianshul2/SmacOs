class Staticvr1
{
    static int a=10;
    void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Staticvr1 t1=new Staticvr1();
        Staticvr1 t2=new Staticvr1();
        Staticvr1 t3=new Staticvr1();
        t1.show();
        t2.show();
        t3.show();
        
        System.out.println(Staticvr1. a);
   
    }
}
/* o/p: 10
   10
   10
   10
*/
