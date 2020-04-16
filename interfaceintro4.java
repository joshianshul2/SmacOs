interface First
    {
        void show();
    }
class A
{
    void show1()
    {
    System.out.println(" Hello from A ");
    }
    }
class B extends A implements First
{
    public void show()
    {
        System.out.println("Hello from B ");
    }

}
class Interfaceintro4
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.show();
    }
}
// o/p: Hello from B
