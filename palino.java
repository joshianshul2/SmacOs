class Paliendrome
{
    public static void main(String[] args)
    {
        int n=121,temp=n,sum=0,r=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println("No is paliendrome "+temp);
        else
            System.out.println("No is not paliendrome "+temp);

    }
}
