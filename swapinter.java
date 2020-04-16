import java.util.Scanner;
  class swap
{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter two no");
            int a=sc.nextInt(),b=sc.nextInt(),c;
            c=a;
            a=b;
            b=c;
            System.out.println("Swaping no are "+a+" "+b);
        }
    }
/*
O/P:
 Enter two no
 5
 6
 Swaping no are 6 5
*/
