import java.util.*;
class Setaj1
{
public static void main(String []args)
    {
        Set s1=new HashSet();
        s1.add("a");
        s1.add("j");
        System.out.println("Hashset = "+s1);
        Set s2 = new TreeSet();  // new treeset(s1);
        s2.addAll(s1);
        System.out.println("TReeSet = "+s2);
    }
}
/*
 Hashset = [a, j]
 TReeSet = [a, j]
*/
