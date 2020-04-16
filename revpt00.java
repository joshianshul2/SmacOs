class Printzerodigit
{
    public static void main(String[] args)
    {
        int n=1500,sum=0,r,s=0,c1=0,c2=0,sam=0,a=0;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            c1++;
        }

        while(sum!=0)
        {
            r=sum%10;
            s=s*10+r;
            sum=sum/10;
            c2++;
        }
        if(c1!=c2)
        {
            a=c1-c2;
            for(int i=0;i<a;i++)
            {
                System.out.print("0");
        }
          }
        while(s!=0)
        {
            r=s%10;
            sam=sam*10+r;
            s=s/10;
        }
        
        System.out.println(sam+" Is the required Reverse No");
    }
}
