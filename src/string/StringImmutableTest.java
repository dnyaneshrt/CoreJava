package string;

public class StringImmutableTest {
    public static void main(String[] args) {
        String s1="test";

        String s2=s1.concat(" java");// concate means added (modified)

        System.out.println(s1);
        System.out.println(s2);

        StringBuffer sbf1=new StringBuffer("test");

        sbf1.append(" java");
        System.out.println(sbf1);

        //String is immutable and StringBuffer is mutable

    }
}
