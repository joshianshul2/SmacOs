class MyThread implements Runnable
{
    Thread t;
    String name;
    MyThread(String thrnm)
    {
        name=thrnm;
        t=new Thread(this,"MyThread");
        System.out.println(t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println(name+i);
                t.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name+" Exit");
        }
        System.out.println(name+" Exit");
    }
}
class MultiThreadintro3
{
    public static void main(String []args)
    {
        MyThread ob1=new MyThread("One");
        MyThread ob2=new MyThread("Two");
        MyThread ob3=new MyThread("Three");
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Main"+i);
                Thread.sleep(1000);  // it goes to sleep;
            }
        }
        catch(InterruptedException e)
        
        {
            System.out.println(e);
        }
        System.out.println("Main Exit");
    }
}
/*
 o/p:->
 Thread[MyThread,5,main]
 Thread[MyThread,5,main]
 One1
 Thread[MyThread,5,main]
 Two1
 Three1
 Main1
 One2
 Two2
 Three2
 Main2
 One3
 Two3
 Three3
 Main3
 One4
 Three4
 Two4
 Main4
 One5
 Main5
 Three5
 Two5
 Main Exit
 Two Exit
 Three Exit
 One Exit
 */
