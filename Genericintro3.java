class Gen<T,V>
{
    T a1;
    V a2;
    Gen(T temp1,V temp2)
    {
        a1=temp1;
        a2=temp2;
    }
    void show()
    {
        System.out.println(a1+" "+a1.getClass());// it will print the location of the class and class name;
        System.out.println(a2+" "+a2.getClass());
    }
};
class Genericintro3
{
    public static void main(String []args)
    {
        Gen<String,Integer>g1=new Gen<String,Integer>("Hello",100);
        Gen<Integer,String>g2=new Gen<Integer,String>(190,"Indore");
        g1.show();
        g2.show();
    }
};
/*
 O/P:
 Hello class java.lang.String
 100 class java.lang.Integer
 190 class java.lang.Integer
 Indore class java.lang.String
 */
