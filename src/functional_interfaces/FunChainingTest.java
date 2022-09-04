package functional_interfaces;

import java.util.function.Function;

public class FunChainingTest {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=n->n+n;
        Function<Integer,Integer> f2=n->n*n*n;
        System.out.println(f1.andThen(f2).apply(5));//f1 evaluates first and use value for second f2
        System.out.println(f1.compose(f2).apply(10));//f2 evaluates first and use result for f1

    }
}
