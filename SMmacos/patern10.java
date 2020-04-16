class Paternspaceodd2
{
    public static void main(String[] args)
    {
        int j,i;
        for(i=1;i<=5;i++)
        {
            for(int k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=4;i>=1;i--)
        {
            for(int k=5;k>i;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
