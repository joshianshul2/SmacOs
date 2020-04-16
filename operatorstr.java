class Operatorstr
{
    public static void main(String args[])
    {
        String str1=new String("Hello");
        String str2=new String("Hello");
        if(str1==str2)
        {
        System.out.println("Hello");
        }
        else{
    System.out.println("Bye...");
    }
}
}
//o/p:->  Bye... becoz it is a operator which is not a internal calling it is a external calling its based on HashCode not values;
