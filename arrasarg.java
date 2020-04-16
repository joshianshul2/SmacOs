class Arrasarg
{
void add(int a[]) // Here a[] its is a ref variable that can hold object hashcode;
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
public static void main(String args[])
{
Arrasarg t1=new Arrasarg();
int x[]={10,20,30,40,50};
int y[]={100,200,300,400,500};
t1.add(x);
t1.add(y);
}
}
