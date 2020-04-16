class Excepintro2
{
    public static void main(String []args)
    {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(Arithmetic Exception e)
        {
            System.out.println(e);
        }
    }
    
}
// o/p: java.lang.ArithmeticException: / by zero
