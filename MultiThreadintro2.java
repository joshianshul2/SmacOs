class MyThread implements Runnable
{
    Thread t;
  MyThread()
    {
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
                    System.out.println("MyThread"+i);
                    t.sleep(1000);
                }
            }
            catch(InterruptedException e)
            {
                System.out.println("My Thread Exit");
            }
        }
}
    class MultiThreadintro2
    {
        public static void main(String []args)
    {
        MyThread t=new MyThread();
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
 Main1
 MyThread1
 MyThread2
 Main2
 MyThread3
 Main3
 Main4
 MyThread4
 MyThread5
 Main5
 Main Exit
 */
