package functional_interfaces;

import java.util.function.Function;

public class StrLenTest {

    public static void strlen()
    {
        Function<String,Integer> f=(s)->s.length();
        System.out.println("length of givem string is  "+f.apply("dnyaneshwar"));
        System.out.println("length of givem string is  "+f.apply("tatyarao"));
        System.out.println("length of givem string is  "+f.apply("sartape"));
    }
    public static void findSquare()
    {
        Function<Integer,Integer> f=(n)->n*n;
        System.out.println(f.apply(15));
        System.out.println(f.apply(20));
        System.out.println(f.apply(25));

    }
    public static void main(String[] args) {
       strlen();
       findSquare();
    }
}
