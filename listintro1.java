import java.util.*;
class Listintro1
{
    public static void main(String []args)
    {
        ArrayList s1=new ArrayList();
        s1.add("S");
        s1.add("M");
        s1.add("AJ");
        s1.remove("AJ");
        System.out.println(s1+" "+"Size is "+s1.size());
    }
}
/*
 Warning Check:
 -Xlint:unchecked
 o/p:
 [S, M] Size is 2
 */
