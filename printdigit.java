class Printdigit
{
    public static void main(String[] args)
    {
        int n=153,sum=0,r,s=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        while(sum!=0)
{
r=sum%10;
s=s*10+r;
sum=sum/10;
}
System.out.println("Digit are : "+s);
    }
}
