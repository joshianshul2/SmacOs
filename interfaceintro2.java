interface First
    {
       
        int a=10;
        void show();
    }
interface Second
    {
        int b=20;
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
        System.out.println("Sum= "+(a+b));
    }
}
class Interfaceintro2
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
*/
