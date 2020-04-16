import java.util.Scanner;
class Insertion
{
public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Entre a no ");
        int n=sc.nextInt();
        System.out.println("Entre a no in Array ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a postion of insertion ");
        int pos=sc.nextInt();
        System.out.println("Enter a value of insertion ");
        int value=sc.nextInt();
        for(int i=n-1;i>=pos-1;i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=value;
        System.out.println("Required no are : ");
        for(int i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
/*
 o/p:
 Entre a no
 5
 Entre a no in Array
 1
 2
 3
 4
 5
 Enter a postion of insertion
 3
 Enter a value of insertion
 42
 Required no are :
 1
 2
 42
 3
 4
 5
*/
