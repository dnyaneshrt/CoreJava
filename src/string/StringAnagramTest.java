package string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagramTest {

    public static boolean isAnagram(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();

        if(l1!=l2)
            return false;

      char[] ch1= s1.toCharArray();
      char[] ch2= s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<l1;i++) {
            if (ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string:");
        String s1=sc.nextLine();

        System.out.println("enter second string:");
        String s2=sc.nextLine();

        if(isAnagram(s1,s2))
            System.out.println("it's anagram" );
        else
            System.out.println("it's not an anagram");

    }
}
