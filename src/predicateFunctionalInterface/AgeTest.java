package predicateFunctionalInterface;

import java.util.function.Predicate;

public class AgeTest {
    public static void main(String[] args) {
        Predicate<Integer> p1=i->i>18;//predicate using lamda expression
        if(p1.test(20))
        {
            System.out.println("eligible for voting");
        }else {
            System.out.println("not eligible for voting");
        }


        System.out.println(p1.test(15));
        System.out.println(p1.test(19));
    }
}
