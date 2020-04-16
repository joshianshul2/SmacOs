class Mtdoverload
{
    void add()
    {
        System.out.println("Default ");
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
void add(int x,int y,int z)
    {
        int c=x+y+z;
        System.out.println(c);
    }
public static void main(String args[])
    {
    Mtdoverload t1=new Mtdoverload();
t1.add();
t1.add(10,20);
t1.add(100,200,300);
}
}
