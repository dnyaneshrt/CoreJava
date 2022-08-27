package practice;

public class MethodOverLoadingTest {

    public void add()
    {
        System.out.println(" from method A");
    }
    public void add(int a)
    {
        System.out.println(" from method Add with params "+a);
    }
    public void add(String a)
    {
        System.out.println(" from method Add with params string "+a);
    }
    public static void main(String[] args) {
        MethodOverLoadingTest mt=new MethodOverLoadingTest();
        mt.add();
        mt.add(10);
        mt.add("hello");
    }
}
