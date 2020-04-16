import java.util.Scanner;
class TestScanner
{
public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first value ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum="+c);
    }
}
/*
 Enter a first value
 10
 20
 Sum=30
*/
