class Staticvr2
{
    static int a=10;
    static void show()
    {
        System.out.println(a+5);
    }
    public static void main(String args[])
    {
        System.out.println("Hello ");
        System.out.println(a);
        Staticvr2.show();  // class name excess the static methods;
        System.out.println(Staticvr2.a);
        
    }
}
/* Hello
 10
 15
 10
*/
