class A
{
    int a=10;
    }
class B extends A
{
    int a=20;
    void show()
    {
        int a=50;
        System.out.println(a+" ");// local calling;
        System.out.println(this.a+" "); // current obj calling;
        System.out.println(super.a+" "); // upper calling means parent class var calling;
    }
}
class Supervar
{
    public static void main(String[] args)
    {
        B b1=new B();
        b1.show();
    }
}
/* o/p:
 50
 20
 20
 */
