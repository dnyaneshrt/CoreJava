package basic_programs;

import java.util.Scanner;

public class ReverseNumTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter a number");
        int num=sc.nextInt(); //getting input as int value  from user
        int sum=0;

        while(num>0)
        {
            int rem=num%10;//2000
            sum=sum*10+rem;
            num=num/10;

        }
        System.out.println("reverse value is: "+sum);

    }
}
