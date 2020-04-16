class Returnbyvalue
{
    int add(int a,int b)
    {
        int c;
        c=a+b;
        return(c);
    }
public static void main(String args[])
    {
        Returnbyvalue t1=new Returnbyvalue();
        int x=t1.add(10,20);
        System.out.println(x);
        System.out.println(t1.add(100,200));
    }
}
