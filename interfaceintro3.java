interface First
    {
        
        int a=10;
        void show();
    }
interface Second
    {
        int a=20;
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
    void add()
    {
        System.out.println("Sum= "+(First.a+Second.a));  // if System.out.println("Sum= "+(a+a)) :-> reference to a is ambiguous
    }
}
class Interfaceintro3
{
    public static void main(String args[])
    {
        A a1=new A();
        a1.show();
        a1.display();
        a1.add();
    }
}
/*
 o/p:
 Hello from show
 Hello from display
 Sum= 30
 Becoz interface has default static variable so its excess by class name;
 */
