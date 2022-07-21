package oops_programs;

import java.util.Scanner;

public class MethodTest {

    public void welcome()
    {
        System.out.println("welcome everyone!!!");
    }

    //instance method.
    public String getName(String name)
    {
        return "Good Job "+name;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("please enter first value");
        int num1=sc.nextInt();

        System.out.println("please enter second value");
        int num2=sc.nextInt();

        System.out.println("addition of two numbers are"+(num1+num2));

        System.out.println("please enter first value");
        int num3=sc.nextInt();

        System.out.println("please enter second value");
        int num4=sc.nextInt();

        System.out.println("addition of two numbers are"+(num3+num4));

    }
}
