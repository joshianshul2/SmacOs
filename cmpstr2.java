class Cmptostr2
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("Helloindore");
        int x=str1.compareTo(str2);
        System.out.println(x);
    }
}
// O/P = -6; becoz it is not same length so it cmp lenghts only;
