class Sorting
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
    }
}
