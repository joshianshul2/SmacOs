class Gen<T>
{
    T a1;
    Gen(T temp1)
    {
        a1=temp1;
    }
    T show()
    {
        return a1;
    }
};
class Genericintro4   //Boxing concept;
{
    public static void main(String []args)
    {
        int c;
        Gen<Integer>g1=new Gen<Integer>(100);
       // Gen<Integer,String>g2=new Gen<Integer,String>(190,"Indore");
        Object x=g1.show(); // Unboxing concept;or Integer x=g1.show(); is also valid ;
        System.out.println(x);
}
}
/*
 O/P:
 100
 */
