import java.util.Scanner;
class Calculator
{
public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println(" Press 1 for Addition \n Press 2 for Substration \n Press 3 for Multiplication\n Press 4 for Division\n Press 5 for Modulus\nThank You Very much ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("Add="+(a+b));
                break;
            case 2: System.out.println("Sub="+(a-b));
                break;
            case 3: System.out.println("Mult="+(a*b));
                break;
            case 4: System.out.println("Div="+(a/b));
                break;
            case 5: System.out.println("Modulus="+(a%b));
            default: System.out.println("Sorry Not valid ");
        }
           }
             }/*
O/P:->
               Enter two Numbers
               10
               20
               Press 1 for Addition
               Press 2 for Substration
               Press 3 for Multiplication
               Press 4 for Division
               Press 5 for Modulus
               Thank You Very much 
               3
               Mult=200
*/
