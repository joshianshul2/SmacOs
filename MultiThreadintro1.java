class MultiThreadintro1
{
    public static void main(String []args)
    {
    Thread t=Thread.currentThread();
    System.out.println(t);
    t.setName("My Thread");  // its use for set a name;
    System.out.println(t); // it will print the 3 things name,pripority,running thread;
    System.out.println(t.getName()); //it prints only Name;
    t.setPriority(Thread.MAX_PRIORITY);// it sets max priority i.e is 10;
    System.out.println(t);
    System.out.println(t.getPriority());// it only prints only priority;
    System.out.println(t.isAlive());
    try
        {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i);
            t.sleep(1000);  // it goes to sleep;
        }
    }
    catch(InterruptedException e)

    {
        System.out.println(e);
    }
        }
}
/*
o/p:->
 Thread[main,5,main]
 Thread[My Thread,5,main]
 My Thread
 Thread[My Thread,10,main]
 10
 true
 0
 1
 2
 3
 4
 5
*/
