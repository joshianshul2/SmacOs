class Fibonicci
{
public static void main(String[] args)
{
    int a=0,b=1,c,n=7,i=1;
    while(i<=n)
    {
        c=a+b;
        System.out.println(a);
        a=b;
        b=c;
        i++;
    }
    
}
}
