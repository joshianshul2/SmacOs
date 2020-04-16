class A
{
 void show1()
    {
        System.out.println("Hello from A");
    }
}
class B extends A
{
    void show2()
    {
        System.out.println("Hello from B");
    }
}
class Refprtoch
{
public static void main(String args[])
    {
        B b1=new B();
        A a1=b1;
       a1.show1();
       // a1.show2(); not valid becoz parent is not ecxess to child class;
    }
}
// o/p: Hello from A;
