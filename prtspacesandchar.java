class Prtspaceandchar
{
    public static void main(String args[])
    {
        String str="This is jva class"; //str is refernce variable;
        
        int sp=0,ch=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                sp++;
            }
            else
            {
                ch++;
            }
        }
        System.out.println("Spaces= "+sp);
        System.out.println("Characters="+ch);
    }
}
// o/p:-> Spaces= 3,characters=14;
