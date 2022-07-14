package basic_programs;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any Number");
        int num=sc.nextInt();

        int temp=num; //

        int sum=0;
        while(num>0)
        {
            int r=num%10;  //123%10  = 3
            sum=sum*10+r;
            num=num/10; //123/10=12

        }

        if(sum==temp)
            System.out.println("it's Palindrome");
        else
            System.out.println("it's not Palindrome");


    }
}
