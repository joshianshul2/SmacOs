class A
{
    A(int a, int b)
    {
        System.out.println("Hello from A"+a+" "+b);
    }
}
class B extends A
{
    B(int x,int y, int z)
    {
        super(10,20);
        System.out.println("Hello from B"+x+" "+y+" "+z);
    }
}
class SuperConstinher
    {
    public static void main(String[] args)
    {
        
        A a1=new A(10,20);
        B b1=new B(100,200,300);
    }
}
/* o/p:
 Hello from A
 Hello from A
 Hello from B
 */
