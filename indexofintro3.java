class Indexintro3
{
    public static void main(String args[])
    {
        String str=new String("indore is in india");
        int x=0;
        while(x!=-1)
        {
            x=str.indexOf("in",x);
           if(x>=0)
              {
        System.out.println((x));// it word is not find so it return -1;
                  x++;
              }
            }
    }
}
// o/p: 0,10,30
