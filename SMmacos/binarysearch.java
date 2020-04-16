class Binarys
{
    
    public static void main(String []args)
    {
        int a[]={20,30,10},temp;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=(i+1);j<a.length;j++)
            {
                
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int x:a)
        {
            
            System.out.println("Sorting elements are: "+x);
        }
int low=0,high=a.length-1,mid=0,f=0,n=10;
while(low<=high)
{
mid=((low+high)/2);
if(a[mid]==n)
{
f=1;
break;
}
else
if(n>a[mid])
{
low=mid+1;
}
else
{
high=mid-1;
}
}
if(f==1)
{
System.out.println("Element found ");
}
else
System.out.println("Element Not found ");
}

}
