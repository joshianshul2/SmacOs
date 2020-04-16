class Prime
{
public static void main(String [] args)
    {
        int f=0,n=7;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
              }
        if(f==0)
        {
        System.out.println(" Prime no ");
        }
                           else
                           System.out.println("Not a Prime no ");
        
    }
}
