class Staticvr4$
{
    static int a=10;
    static void show()
    {
        System.out.println(a);
    }
}
    class Staticvr4
{
    public static void main(String args[])
    {
        System.out.println("Hello ");
        System.out.println(Staticvr4.a);
        Staticvr4.show();  // class name excess the static methods;
        System.out.println(Staticvr4.a);

        Staticvr4.show();
    }
}
// o/p= 10;
