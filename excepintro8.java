class Excepintro8 // Multiple try-catch relationship;
{
    public static void main(String []args)
    {
        int a=10,b=0,c,d[]={10,20,30};
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e) // it handles all the all exceptions becoz it is a parent class (Exception);
        {
            System.out.println("Oye Galti krr raha hai ");
        }
        try
        {
            System.out.println(d[3]);
        }
         catch(ArrayIndexOutOfBoundsException e)
    {
          System.out.println("Array is out of bonds Please check it Again");
        }
        System.out.println("Bye ");
    }
}
/*
 o/p:
 Oye Galti krr raha hai
 Array is out of bonds Please check it Again
 Bye
 */
