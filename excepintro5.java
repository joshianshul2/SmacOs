class Excepintro5
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
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        //catch(ArrayIndexOutOfBoundsException e)
        //      {
        //        System.out.println(e);
        //  }
        System.out.println("Bye ");
    }
}
/*
 o/p: 1
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at Excepintro4.main(excepintro4.java:10) */
