class Stringarrprtind
{
    public static void main(String args[])
    {
        String str[]={"indore","bhopal","dewas","dhar","ujjain","indore","indonesia","bhind"};
        for(int i=0;i<str.length;i++)
        {
            if(str[i].indexOf("ind")==0)
            {
            System.out.println(str[i]);
        }
        }
    }
}
/*
o/p :
 indore
 indore
 indonesia
*/
