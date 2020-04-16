class Excepintro10 // toString()  relationship;
{
    String str;
    Excepintro10(String temp)
    {
        str=temp;
    }
    public String toString()
    {
        return str;
    }
    public static void main(String []args)
    {
        Excepintro10 t1=new Excepintro10("Hello ");
        Excepintro10 t2=new Excepintro10("Indore ");
        System.out.println(t1); // t1.toString();
        System.out.println(t2); // t2.toString();
    }
}
/*
 o/p: Hello
      Indore
 
 */
