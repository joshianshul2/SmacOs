class Sortinginstr
{
    public static void main(String args[])
    {
        String str[]={"INDORE","bhopal","dewas","dhar","ujjain","indore","indonesia","bhind"};
        String temp;
        for(int i=0;i<str.length;i++)
        {
            for(int j=(i+1);j<str.length;j++)
        {
            if(str[i].toLowerCase().compareTo(str[j])>0)     // it cmp the ascii code of each word;
            {
                temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
        }
            for(String s:str)
            {
                System.out.println(s);
            }
    }
}
/*
 o/p :bhind
 bhopal
 dewas
 dhar
 indonesia
 indore
 indore
 ujjain
 */
