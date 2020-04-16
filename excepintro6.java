class Excepintro6
{
    public static void main(String []args)
    {
        int a=10,b=10,c,d[]={10,20,30};
        try
        {
            c=a/b; //// JRH will encountered i.e java runtime handler;
            System.out.println(c);
            System.out.println(d[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
              {
                System.out.println("Array is out of bonds Please check it Again");
         }
        System.out.println("Bye ");
    }
}
/*
 o/p: 1
 Array is out of bonds Please check it Again
 Bye
*/
