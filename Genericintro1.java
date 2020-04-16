class Gen<T>
{
    T a1;
    Gen(T temp1)
    {
        a1=temp1;
    }
    void show()
    {
        System.out.println(a1);
    }
    }
class Genericintro1
{
       public static void main(String []args)
   {
        Gen<String>g1=new Gen<String>("Hello");
        Gen<Integer>g2=new Gen<Integer>(19);
          g1.show();
        g2.show();
 }
}
// hello, 19;
