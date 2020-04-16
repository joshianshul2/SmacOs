class Javaintro5
{
    int a;
    public static void main(String args[])
    {
        Javaintro5 j1=new Javaintro5();// IT PRINTS HASHCODE I.E LIKE A UNIQUENESS TO FIND OBJECT UNIQUE IDENTITY;
        Javaintro1 j2=new Javaintro1();//IT HAS DIFFERENT CODES FOR DIFFERENT OBJECT;
        Javaintro1 j3=new Javaintro1();//
        j1.a=10;
        j2.a=20;
        j3.a=40;
        System.out.println(j1.toString());//same as below code it also print hash Code to its object by toString class;
        System.out.println(j2);
        System.out.println(j3.hashCode());// it also prints hashcode but only in integer value;
    }
}
