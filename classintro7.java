class Javaintro7
{
    int a;
    public static void main(String args[])
    {
        Javaintro1 j1=new Javaintro1();//it is object becoz it allocate memoryand its also knowns as mutability of obj;
        Javaintro1 j2=j1;// it is not a obj its a refernece which pointing to itself object only and share memory of same obj;
        j1.a=10;
        j2.a=20;
        System.out.println(j1.a);
        System.out.println(j2.a);

    }
}
