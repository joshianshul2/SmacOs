class Vararg
{
void add(int ...a)// here int ...a  is Ellipse declaration;
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
     Varasr t1=new Varasr();
     t1.add(10,20,30,40,50,60,70,80,90,100);
     t1.add(10,20,4,56);
     }
     }
