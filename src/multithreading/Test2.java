package multithreading;

public class Test2 {
    public static void main(String[] args) {

        Thread t1=new Thread(()-> {
            for(int i=1;i<=5;i++)
            {
                try{Thread.sleep(500);}catch(Exception e){}
                System.out.println("Hi Thread "+Thread.currentThread().getName());
            }
        },"First");

        try{Thread.sleep(100);}catch(Exception e){}
        Thread t2=new Thread(()-> {
            for(int i=1;i<=5;i++)
            {
                try{Thread.sleep(500);}catch(Exception e){}
                System.out.println("Hello Thread "+Thread.currentThread().getName());
            }
        },"Second");
        t2.start();
        try{Thread.sleep(500);}catch(Exception e){}
        t1.start();


    }
}
