import java.util.*;
class Setintro2
{
    public static void main(String []args)
    {
        HashSet s1=new HashSet();
        s1.add("S");
        s1.add("M");
        System.out.println(s1+" "+"Size is "+s1.size());
    }
}
/*
 Warning Check:
 -Xlint:unchecked
 o/p:
 [S, M] Size is 2
 */
