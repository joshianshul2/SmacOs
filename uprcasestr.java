class Upercasestr
{
public static void main(String args[])
    {
        String str=new String("Hello");
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=97 && ch<=122)
            {
                System.out.println((char)(ch-32));//Type casting take place int to char;
            }
            else
            {
                System.out.println(ch);
            }
            }
        }
    }
