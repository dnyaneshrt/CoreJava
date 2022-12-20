package interview_coding_practice;

import java.util.Arrays;

public class StringAnagram {
    private static boolean isStringAnagram(String str1, String str2) {
        int len1=str1.length();
        int len2=str2.length();

         if(len1!=len2)
             return false;

         char[] ch1=str1.toLowerCase().toCharArray();
         char[] ch2=str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

         for(int i=0;i<len1;i++)
         {
             if(ch1[i]!=ch2[i])
                 return false;
         }

        return true;
    }
    public static void main(String[] args) {
        String str1="ABC";
        String str2="BCa";

        if(isStringAnagram(str1,str2))
              System.out.println("Anagram");
          else
              System.out.println("It's not Anagram");
    }
}
