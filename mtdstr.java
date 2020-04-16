class Mtdstr
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("Hello");
        if(str1.equals(str2))
        {
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye...");
        }
    }
}
//   o/p:->  Hello...  becoz it is a metod which is internal calling not external calling its based on values not HashCodes;
