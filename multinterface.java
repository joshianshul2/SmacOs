interface First
    {
        void show();
    }
interface Second
    {
        void display();
    }

class A implements First,Second
{
    public void show()
    {
        System.out.println("Hello from show ");
    }
    public void display()
    {
        System.out.println("Hello from display ");

}
}
class Multinterface
{
    public static void main(String args[])
    {
        A a1=new A();
        a1.show();
        a1.display();
    }
}
// o/p: Hello from show ,hello from display
