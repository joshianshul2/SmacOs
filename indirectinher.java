interface First
    {
        void show();
    }
interface Second
    {
        void display();
    }
class A
{
    public void show()
    {
        System.out.println("Hello from A");
    }
}
class B extends A implements First,Second
{
        public void display()
    {
        System.out.println("Hello from display ");
        
    }
}
class Indirectinher
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.show();
        b1.display();
    }
}
// o/p: Hello from A,hello from display
