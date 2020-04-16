import java.util.*;
class Mapintro1
{
    public static void main(String []args)
    {
        Map s1=new HashMap();
        s1.put(1,"S");
        s1.put(2,"M");
        s1.put(3,"AJ");
        s1.remove(3);
        System.out.println(s1+" "+"Size is "+s1.size());
    }
}
/*
 Warning Check:
 -Xlint:unchecked
 o/p:
 [S, M] Size is 2
 */
