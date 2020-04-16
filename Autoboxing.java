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
class Autoboxing
{
    public static void main(String []args)
    {
        int c=10;
        Gen<Integer>g1=new Gen<Integer>(c); // c is automatically covt into object;
        System.out.println(c);
    }
}
/*
 O/P:
 10
 */
