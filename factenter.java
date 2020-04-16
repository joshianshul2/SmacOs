import java.util.Scanner;
class Factenter
{
public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        int n=sc.nextInt(),f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial no="+f);
    }
}
/*
o/p:
 Enter a no
 5
 Factorial no=120
*/
