package practice;

import java.util.Scanner;

//JVM :
public class NumberTest {
    //static
    public static int findfactorial(int num)
    {
        int fact=1;

        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
//instance method
    public boolean checkPrime(int num)
    {
        int count=0;
        if(num==1)
            return false;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
               count++; //2
            }
        }
        if(count==2)
            return true;
        else
            return false;

    }
    //instance method
    public void fibonacci(int range)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=range;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }

    public static void sumOfSeries(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is :"+sum);
    }
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();// will take int value as input from user

        int result=  NumberTest.findfactorial(num);// calling static methods
        System.out.println("factorial of "+num+" is : "+result);

        NumberTest n1=new NumberTest();
        boolean check= n1.checkPrime(num);//call instance method by passing param

        if(check)
            System.out.println("entered number is prime");
        else
            System.out.println("entered number is not prime number");

        n1.fibonacci(num);// calling fobonacci function
        NumberTest.sumOfSeries(num);
    }
}
