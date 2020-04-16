import java.util.Scanner;

 class Dectobin
{
    public static void main(String args[])
    {
        int decnum, rem, quot, i=1, j;
        int binnum[] = new int[100];
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter any Decimal Number : ");
        decnum = scan.nextInt();
        
        quot = decnum;
        
        while(quot != 0)
        {
            binnum[i++] = quot%2;
            quot = quot/2;
        }
        
        System.out.print("Equivalent Binary Value of " + decnum + " is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }
        System.out.println();
    }
}
