package predicateFunctionalInterface;

import java.util.function.Predicate;

/*
1)Predicate is functional interface present in java.util.function package
2)Predicate introduced in java 1.8 version
3)Predicate is having only one abstract method called Test(T t),
4) which gives result in boolean on the basis of given condition
*/

public class StringLenTest {
    public static void main(String[] args) {
        Predicate<String> p1=s->s.length()>5;
        System.out.println(p1.test("abcdef"));
        System.out.println(p1.test("lmn"));
    }
}
