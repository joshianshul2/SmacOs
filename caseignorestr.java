class Caseignorestr
{
    public static void main(String args[])
    {
        String str1=new String("HELLO");
        String str2=new String("Hello");
        if(str1.equalsIgnoreCase(str2)) //Ignore case ;
        {
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye...");
        }
    }
}
//   o/p:->  Hello...  becoz it is a metod which is internal calling not external calling its based on values not HashCodes;
