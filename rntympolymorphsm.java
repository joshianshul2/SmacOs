class A
{
    void show()
    {
        System.out.println("Hello from A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("Hello from B");
    }
}
class Rntympoly
{
    public static void main(String args[])
    {
        B b1=new B();
        A a1;
        a1=b1;
        a1.show();
    // a1.show2(); not valid becoz parent is not ecxess to child class;
    }
}
// o/p: Hello from B;
