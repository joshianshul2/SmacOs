interface A
{
    void show();
}
interface B extends A
{
    void display();
}
class Interfaceintro5 implements A,B
{
   public void show()   /* void show()
    attempting to assign weaker access privileges; was public
    
                   */
{
        System.out.println("Hello from A");
    }
    public  void display()
    {
        System.out.println("Hello from B");
    }
public static void main(String []args)
    {
        Interfaceintro5 t1=new Interfaceintro5();
        t1.show();
        t1.display();
    }
}
/*
o/p:->
 Hello from A
 Hello from B
*/
