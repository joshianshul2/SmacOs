class Cmptostr
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("hello");
        int x=str1.compareTo(str2);
        System.out.println(x);
        }
    }
// O/P = -32; it only cmp first char i.e diffrence of ascii code is 32;
