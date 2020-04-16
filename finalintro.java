class Finalintro
{
    final int a;
    Finalintro(int x)
    {
        a=x;
    }
    void show()
    {
        //a++; o/p: error: cannot assign a value to final variable a
        //a++;
        
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Finalintro t1=new Finalintro(10);
        Finalintro t2=new Finalintro(100);
        t1.show();
        t2.show();
    }
}
/*
 o/p :
 10
 100
*/
