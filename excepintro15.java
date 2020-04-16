class Excepintro15
{
    void div(int a,int b)throws ArithmeticException
    {
        int c;
        if(b==1)
        {
            throw new ArithmeticException("/ by one");
        }
        else
        {
            c=a/b;
            System.out.println(c);
        }
    }
public static void main(String []args)
    {
        Excepintro15 t1=new Excepintro15();
        try
        {
            t1.div(10,2);
            t1.div(10,0);
            t1.div(10,1);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Don't Divide by Zero Thank you very much ");
        }
        finally
        {
    System.out.println("Bye");
    }
      }
}
/*
 5
 java.lang.ArithmeticException: / by zero
 Bye
*/
