package oops_programs;

public class ConOverLoadTest {
    ConOverLoadTest()
    {
        System.out.println("zero param constructor");
    }
    ConOverLoadTest(float num)
    {
        System.out.println("paramterized constructor: "+num);
    }
    public static void main(String[] args) {
        new ConOverLoadTest(115);
        new ConOverLoadTest();
    }
}
