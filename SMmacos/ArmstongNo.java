class Armstrong  //armstrong no are:153,370,371,407;
{
    public static void main(String[] args)
    {
        int n=153,temp=n,sum=0,r=0;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==n)
        {
            System.out.println(n+ "  is a Armstong No ");
        }
        else
        {
            System.out.println("Not a Armstrong no");
        }
    }
}
