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
class Multinterref
{
    public static void main(String args[])
    {
        A a1=new A();
        First f1=a1;
        f1.show();
        System.out.println("hello $$$$$");
        Second f2=a1;
        f2.display();
    }
}
/* o/p:
Hello from show
hello $$$$$
Hello from display
*/
