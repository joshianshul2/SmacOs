class Reverse
{
public static void main(String[] args)
{
int n=153,temp=0,sum=0,r=0;
while(n!=0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
System.out.println("Reverse no is "+sum);
}
}
