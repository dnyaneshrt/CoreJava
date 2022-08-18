package exception;


import java.util.Scanner;

public class ExTest1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=0;
      try
      {
          System.out.println("enter first number");
          num1=sc.nextInt();

          System.out.println("enter second number");
          num2=sc.nextInt();

          System.out.println("addition="+(num1/num2));
      }catch(Exception e)
      {
          e.printStackTrace();

      }
      finally
      {
          System.out.println("db close logic.  must exceute logic");
      }

        System.out.println("1000 lines of code");
        System.out.println("1000 lines of code");

    }
}
