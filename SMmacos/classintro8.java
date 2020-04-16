class classs1
{
    int a,b,c;
}
class classs2
{
public static void main(String args[])
    {
        classs1 j1=new classs1();
        classs1 j2=new classs1();//we can create object of differnt class;
        j1.a=10;
        j1.b=20;
        j1.c=30;
        j2.a=100;
        j2.b=200;
        j2.c=300;
        System.out.println(j1.a+"..."+j1.b+"..."+j1.c);
        System.out.println(j2.a+"..."+j2.b+"..."+j2.c);
 }
  }
