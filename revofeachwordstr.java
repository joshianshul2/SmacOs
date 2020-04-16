class Revofwordstr
{
    public static void main(String args[])
    {
        String str="This is java class"; //str is refernce variable;
        char temp;
        for(int i=0;i<str.length();i++)
        {
                        if((str.charAt(i)==' ') || (i==str.length()))
            {
                for(int j=temp.length()-1;j>=0;j--)
                {
                    temp+=str.charAt(i);

                    System.out.print(str.charAt(str.charAt(j)));
                }
            }
        }
    }
}
