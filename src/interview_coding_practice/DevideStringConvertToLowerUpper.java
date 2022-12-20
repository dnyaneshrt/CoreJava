package interview_coding_practice;

public class DevideStringConvertToLowerUpper {
    public static void main(String[] args) {
        String s="My name is Dnyaneshwar My name is Dnyaneshwar";
        int mid=s.length()/2;
        String first_string="";
        String second_string="";
        for (int i=0;i<s.length();i++)
        {
            if(i<mid)
                first_string=first_string+Character.toUpperCase(s.charAt(i));
            else
                second_string=second_string+Character.toLowerCase(s.charAt(i));

        }
        System.out.println(first_string+second_string);
    }
}
