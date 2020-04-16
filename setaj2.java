import java.util.*;
class Setaj2
{
public static void main(String []args)
    {
        Set <String> s1=new HashSet<String>();
        s1.add("s");
        s1.add("m");
        s1.add("o");
        s1.add("s");
        s1.add("F");
        System.out.println("HashSet = "+s1);
        TreeSet <String> ts1=new TreeSet <String>(s1);
        System.out.println(s1);
    }
}
/*
 HashSet = [s, F, m, o]
 [s, F, m, o]
*/
