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
class Autounboxing
{
    public static void main(String []args)
    {
        int c=100;
        Gen<Integer>g1=new Gen<Integer>(c);
                Object x=g1.show(); // AutoUnboxing concept;or Integer x=g1.show(); is also valid ;
        System.out.println(x);
    }
}
/*
 O/P:
 100
 */
