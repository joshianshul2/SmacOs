class Excepintro1
{
    public static void main(String []args)
    {
        int a=10,b=0,c;
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Please Dont Divide By Zero ");
        }
    }
    
}
// O/P: Please Dont Divide By Zero ;
