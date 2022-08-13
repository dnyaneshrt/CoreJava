package string;

public class StringEqualityTest {
    public static void main(String[] args) {
        String s1="infeanet";
        String s2="infeanet";
        String s3=new String("infeanet");
        String s4=new String("infeanet");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s2);
        System.out.println(s3==s4);

        System.out.println("using equals");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));
        System.out.println(s3.equals(s4));
    }
}
