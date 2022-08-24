package string;

import java.util.Scanner;

public class StringEmailTest {
    public static void main(String[] args) {
      while(true)
      {
        System.out.println("enter any gmail id:");
      String id=new Scanner(System.in).next();
//        String id="dnyansh.sartape18@gmail.com";

//      int i= id.indexOf('@');
//      System.out.println("@ is at index number "+i);

//      int i2= id.indexOf('.');
//      System.out.println(". is at index number "+i2);

//      System.out.println(id.substring(2,7));

     String s=id.substring(id.indexOf('@')+1);
     String  s2= s.substring(0,s.indexOf('.'));
     System.out.println(s2);

     String test="dnyaneshwar";
     System.out.println(test.substring(5));

    }}
}
