package interview_coding_practice;

public class RemoveSpecialCharsFromString {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("please enter String:");
        String s=sc.nextLine();*/
        String s="Dnyaneshar###2434_ Sartape";
        int count=0;

        String s2="";
      /*  for(int i=0;i<s.length();i++)
        {
         if(Character.isAlphabetic(s.charAt(i))||
                 Character.isWhitespace(s.charAt(i))||
                            Character.isDigit(s.charAt(i)))
         {
           s2=s2+s.charAt(i);
         }else {
             count++;
         }
        }*/
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i))||
                    Character.isWhitespace(s.charAt(i))||
                    Character.isDigit(s.charAt(i)))
            {
             count++;
             s2=s2+s.charAt(i);
            }
        }
        System.out.println("Total no. of special characters are there in String :"+(s.length()-count));
        System.out.println("string after removing special characters from: "+s2);
    }
}
