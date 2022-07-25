package oops_programs;

import java.sql.SQLClientInfoException;

public class SeqenceTest {

    static
    {
        System.out.println("from static block");
    }
    SeqenceTest()
    {
        System.out.println("from constructor");
    }
    SeqenceTest(String s)
    {
        System.out.println("from constructor:"+s);
    }
    {
        System.out.println("from instance block1");
    }
    {
        System.out.println("from instance block2");
    }

    public static void main(String[] args) {
        new SeqenceTest();
        new SeqenceTest("infeanet");
    }
}
