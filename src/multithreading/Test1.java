package multithreading;


//First way to create Thread by extending Thread class
class HiThread extends Thread
{
  /*  public void start()
    {
    super.start();
        System.out.println("i am from start method");
    }*/
    public void run()
    {
       for(int i=1;i<=5;i++)
       {
           try{Thread.sleep(500);}catch(Exception e){}
           System.out.println("Hi");
       }
    }

}
class HelloThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try{Thread.sleep(500);}catch(Exception e){}
            System.out.println("Hello");
        }
    }
}

public class Test1 {
    public static void main(String[] args) throws InterruptedException {


        Thread hi=new HiThread();
        Thread hello=new HelloThread();
        hi.start();
        try{Thread.sleep(100);}catch(Exception e){}
        hello.start();
        hi.join();//join() method will ask other threads to wait untill it finishes its excution
        hello.join();//main thread will wait untill hi and hello thread will be done with there execution

        //setName() and getName() methods are used to set the thread names..

        System.out.println("i am main Thread ");
        System.out.println("Thread setName() and Thread getName() methods");
        System.out.println("default thread name: "+Thread.currentThread().getName());
        hi.setName("Hi Thread");
        System.out.println("after setting thread name: "+hi.getName());

        System.out.println("default prority of Hi Thread is "+hi.getPriority());
        System.out.println("default prority of Main Thread is "+Thread.currentThread().getPriority());
        hi.setPriority(10);
        System.out.println("after setting prority of Hi Thread is "+hi.getPriority());

        System.out.println("Thread constants to get MIN,MAX,NORM priority of thread");
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
    }
}
