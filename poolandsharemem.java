class Poolandsharemem
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("Hello");
        // pool memory str1 and 2 are objects with different Hachcode();
        System.out.println("Hello");
        System.out.println("Hello".length());
        System.out.println("Hello".hashCode());
        // shared men=mory becuase its a refence not object so it can hold same Hashecode();
        String str3="Hello";
        String str4="Hello";
        System.out.println("Hello");
        System.out.println("Hello".length());
        System.out.println("Hello".hashCode());
    }
}
/* output:->
 Hello
 5
 69609650
 Hello
 5
 69609650
Because every word written in "" is object so it cpy the hashcode for same object;
 */
