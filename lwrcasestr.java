class Lwrcasestr
{
public static void main(String []args)
    {
        String str=new String("HELLO");
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=65 && ch<=90)
            System.out.println((char)(ch+32));//A->add 32 to get a;
        else
        System.out.println(ch);
    }
}
}
