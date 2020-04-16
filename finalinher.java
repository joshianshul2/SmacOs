class Base
{
    void show()  /* if we have final void show() then its a CE becoz final will give chance to execute the child class so overrid. is not possible;  */
    {
        System.out.println("Hello from Base ");
    }
}
class Child extends Base
{
    final void show()
    {
        System.out.println("Hello from child ");
    }
}
class Finalinher
{
    public static void main(String []args)
    {
        Base b1=new Base();
        Child c1=new Child();
        c1.show();
        
    }
}
// o/p:  Hello from Child ;
