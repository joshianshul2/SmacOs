class Anshulexception extends Exception
{
    String str;
    Anshulexception(String temp)
    {
        str=temp;
    }
    public String toString() // string is a clas  where toString() is present in it;
    {
        return("Anshulexception:"+str);
    }
}
class Excepintro12
{
public static void main(String []args)
    {
        int a=10,b=1,c;
        try
        {
            if(b==1)
            {
                throw new Anshulexception("/ by one");
            }
            else
            {
                c=a/b;
                System.out.println(c);
            }
        }
            catch(Anshulexception e)
            {
                System.out.println(e); // here e is reference so its kaled e.toString()s;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            System.out.println("Bye ");
    }
}
/*
 o/p: Anshulexception:/ by one
 Bye
*/
