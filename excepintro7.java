class Excepintro7
{
    public static void main(String []args)
    {
        int a=10,b=0,c,d[]={10,20,30};
        try
        {
            c=a/b; //// JRH will encountered i.e java runtime handler;
            System.out.println(c);
            System.out.println(d[3]);
        }
        catch(Exception e) // it handles all the all exceptions becoz it is a parent class (Exception);
        {
            System.out.println("Oye Galti krr raha hai ");
        }
       // catch(ArrayIndexOutOfBoundsException e)
        //{
          //  System.out.println("Array is out of bonds Please check it Again");
        //}
        System.out.println("Bye ");
    }
}
/*
 o/p: 
 
 Oye Galti krr raha hai
 Bye
 
 */
