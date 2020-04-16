class Cmptocaseignorestr
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("hellp");
        int x=str1.compareToIgnoreCase(str2);
        System.out.println(x);
    }
}
// O/P = -1;
