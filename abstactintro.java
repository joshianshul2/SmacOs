abstract class  A
{
abstract void show();
void display()
{
System.out.println("Hello from A");
}
}
class B extends A
{
void show()
    {
        System.out.println("Hello from B");
    }
}
class Absintro
{
public static void main(String []args)
    {
        B b1=new B();
        b1.show();
        b1.display();
    }
}
/* o/p:
 Hello from B
 Hello from A
*/
