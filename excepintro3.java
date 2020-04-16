class Excepintro3
{
    public static void main(String []args)
    {
        int a=10,b=10,c,d[]={10,20,30};
        try
        {
            c=a/b;
            System.out.println(c);
            System.out.println(d[3]); // JRH will encountered i.e java runtime handler;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye ");
    }
}
/*
o/p: 1
java.lang.ArrayIndexOutOfBoundsException: 3
Bye
 */
