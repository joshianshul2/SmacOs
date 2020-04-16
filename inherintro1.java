class Base
{
    void display()
    {
    System.out.println("Hello from Base ");
}
}
class Child extends Base
    {
    void show()
        {
    System.out.println("Hello from child ");
}
    }
class Inherintro1
{
    public static void main(String []args)
    {
        Child c1=new Child();
        c1.show();
        c1.display();
    }
}
