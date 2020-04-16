class Javaintro4
{
    int a;
    public static void main(String args[])
    {
        Javaintro1 j1=new Javaintro1();// IT PRINTS HASHCODE I.E LIKE A UNIQUENESS TO FIND OBJECT UNIQUE IDENTITY;
        Javaintro1 j2=new Javaintro1();//IT HAS DIFFERENT CODES FOR DIFFERENT OBJECT;
        j1.a=10;
        System.out.println(j1);
        System.out.println(j2);
    }
}
