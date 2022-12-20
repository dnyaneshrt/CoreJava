package interview_coding_practice;

public class RotationString {

    private static boolean isRotationString(String s1, String s2) {
        System.out.println(s1+s1);
        System.out.println(s2);
        return ((s1.length()==s2.length()) && ((s1+s1).contains(s2)));
    }
    public static void main(String[] args) {
        String s1="abcdef";
        String s2="defabc";
        if(isRotationString(s1,s2))
            System.out.println("both Strings are rotation to each other");
        else
            System.out.println("both Strings are not rotation to each other");
    }

}
