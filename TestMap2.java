import java.util.*;
class TestMap2
{
	public static void main(String args[])
	{
		Map m1=new HashMap();
		m1.put(10,"sunday");
		m1.put(2,"monday");
		m1.put(5,"tuesday");
		m1.put(4,"wednesday");
		m1.put(5,"thursday");
		m1.put(9,"friday");
		m1.put(7,"saturday");
		m1.put(8,"sunday"); 	//Duplication
		System.out.println(m1);
		System.out.println(m1.keySet()); // it prints key values;
        System.out.println(m1.values());  // it prints values; The entrySet() method is used to get a Set view of the mappings contained in this map.
		System.out.println(m1.entrySet());
	}
}
// {} :------> MAP; $ [] :-------> Set;
