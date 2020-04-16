class Staticfinal
{
    static final int a;
    Staticfinal(int x)
    {
        a=x;
    }
    public static void main(String args[])
    {
        Staticfinal s1= new Staticfinal(12);
        System.out.println(a);
}
}
/*
o/p: 
 Staticfinal.java:6: error: cannot assign a value to final variable a
 a=x;
 ^
*/
