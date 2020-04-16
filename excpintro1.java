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
        catch(Arithmetic Exception e)
        {
            System.out.println("Please Dont Divide By Zero ");
        }
    }
    
}
// O/p: Please Dont Divide By Zero
