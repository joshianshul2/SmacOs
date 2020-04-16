class Finalintroerror
{
    final int a=10;
    void show()
    {
        //a++; o/p: error: cannot assign a value to final variable a
        //a++;

        System.out.println(a);
    }
    public static void main(String args[])
    {
        Finalintroerror t1=new Finalintroerror();
        t1.show();
        t1.show();
        t1.show();
    }
}
/*
o/p :
10
10
10
*/
