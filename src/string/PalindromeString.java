package string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("enter any String");
        String name=new Scanner(System.in).nextLine();

        String rev="";

        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }

        if(rev.equals(name))
            System.out.println("it' palindrome");
        else
            System.out.println("it's not palindrome");
    }
}
