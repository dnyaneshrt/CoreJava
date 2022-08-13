package string;

import java.util.Scanner;

public class StringRevTest {
    public static void main(String[] args) {
        System.out.println("Enter your name please");
        String string=new Scanner(System.in).nextLine();
        String rev="";
        int len=string.length();

        char ch=  string.charAt(3);
      System.out.println("char at 3rd index: "+ch);

      for(int i=len-1;i>=0;i--)
      {
          rev=rev+string.charAt(i);
      }

      System.out.println("Above String after reversing: "+rev);

    }
}
