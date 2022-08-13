package string;

public class StringFirstTest {
    public static void main(String[] args) {
        String test="Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. ";

        int len=test.length();
        System.out.println("length of above String is= "+len);

       String[] words= test.split(" ");
       String[] s_words= test.split("s");

       System.out.println("total 's' chars in my String is"+s_words.length);


        int count=1;
       for(String word:words)
       {
           System.out.println(count+++" "+word);
       }

     System.out.println("total words available in my String are: "+words.length);
       System.out.println("Uppercase:\n\n "+test.toUpperCase());
       System.out.println("Lowercase:\n\n "+test.toLowerCase());

       String oddeven="ffffffffffffffffffffffffffffffffffffffffffffffffff";
        String demo="";
       for(int i=0;i<oddeven.length();i++) {
           if(i%2==0)
           {
               //System.out.println(i+":"+oddeven.charAt(i));
             demo=demo+Character.toUpperCase(oddeven.charAt(i));


           }else {
              // System.out.println(i+":"+oddeven.charAt(i));
               demo=demo+Character.toLowerCase(oddeven.charAt(i));

           }


       }
        System.out.println("demo:  "+demo);
    }
}
