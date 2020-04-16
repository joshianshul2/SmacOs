class Javaintro3
{
    int a;
    public static void main(String args[])
    {
        Javaintro1 j1=new Javaintro1();
        j1.a++;
        System.out.println(j1.a); // here a is instance variable which is by default value is 0 (zero);
        j1.a--;
        System.out.println(j1.a);
    }
}
