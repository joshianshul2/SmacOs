import java.util.Scanner;
class Dynarray
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
          }
        System.out.println("Entered values are :-> ");
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    }
}
/*
 Enter a size of array
 10
 10
 20
 30
 40
 50
 60
 70
 80
 90
 100
 Entered values are :->
 10
 20
 30
 40
 50
 60
 70
 80
 90
 100

 */
