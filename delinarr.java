import java.util.Scanner;
class Deletion
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
        System.out.println("Enter a postion of Deletion ");
        int pos=sc.nextInt();
        for(int i=pos-1;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("Required no are : ");
        for(int i=0;i<n-1;i++)
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
 Enter a postion of Deletion
 3
 Required no are :
 1
 2
 4
 5 
 */
