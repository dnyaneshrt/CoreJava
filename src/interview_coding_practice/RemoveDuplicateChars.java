package interview_coding_practice;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String s="Dnyaneshwar";
        String s2="";
        String s3="";

        char[] s_= s.toCharArray();

        Set<Character> set=new TreeSet<>();
       for(int i=0;i<s.length();i++)
       {
           if(set.add(s_[i]))
               s2=s2+s.charAt(i);
           else
               s3=s3+s.charAt(i);

       }
        System.out.println("String after removing duplicate characters "+s2);
        System.out.println(" duplicate characters "+s3);
        System.out.println("total duplicate characters  are: "+s3.length());
    }
}
