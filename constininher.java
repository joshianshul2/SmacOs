class A
{
    A()
    {
       System.out.println("Hello from A");
    }
}
class B extends A
{
    B()
    {
        System.out.println("Hello from B");
    }
}
class Constinher{
    public static void main(String[] args)
    {
        
        A a1=new A();
        B b1=new B();
    }
}
/* o/p:
 Hello from A
 Hello from A
 Hello from B
 */
