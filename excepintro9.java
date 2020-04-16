class Excepintro9 // Nesting of try-catch relationship;
{
    public static void main(String []args)
    {
        int a=10,b=0,c,d[]={10,20,30};
        try
        {
            c=a/b;
            System.out.println(c);
            System.out.println(d[3]);
        }
        catch(ArithmeticException e) // it handles all the all exceptions becoz it is a parent class (Exception);
        {
            System.out.println("Oye Galti krr raha hai / by 0 vala case hai ");
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array is out of bonds Please check it Again");
        }
        // System.out.println("Bye"); thos will not run because error: 'finally' without 'try'
       // finally will get so after try we must apply finally ;
        finally
        {
            System.out.println("BAahubali commitment i.e Always wins");
        }
    }
}
/*
 o/p:
 Oye Galti krr raha hai / by 0 vala case hai
 BAahubali commitment i.e Always wins
 */
