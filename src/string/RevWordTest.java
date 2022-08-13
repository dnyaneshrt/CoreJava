package string;

import java.util.Scanner;

public class RevWordTest {

    public static void main(String[] args) {
        System.out.println("Enter your name please");
       String string=new Scanner(System.in).nextLine();

        String rev="";

   String[] words=string.split(" ");

   for(String word:words) {
       for (int i = word.length() - 1; i >= 0; i--) {
           rev = rev + word.charAt(i);
       }
       rev=rev+" ";
   }
        System.out.println("Above String after reversing: "+rev);

    }
}
