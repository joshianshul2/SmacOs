class Excepintro11
{
    public static void main(String []args)
    {
        int a=10,b=1,c;
        try
        {
           if(b==1)
           {
               throw new ArithmeticException("/ by one"); // here arth.. is bject which catch by refenece in catch blocks;
           }
            else
            {
            c=a/b;
            System.out.println(c);
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Bye ");
    }
}
/*
 o/p:
 java.lang.ArithmeticException: / by one
 Bye
 */
