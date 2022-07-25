package oops_programs;

public class FunctionOverloadingTest {
    void add()
    {
        System.out.println("welcome to zero param add method");
    }
    void add(int a)
    {
        System.out.println("welcome to one param add method: "+a);
    }

    void add(int num1,String num2)
    {
        int n2=Integer.parseInt(num2);
        System.out.println("addition="+(num1+n2));
    }

    public static void main(String[] args) {

        FunctionOverloadingTest fot=new FunctionOverloadingTest();
        fot.add(1234);
        fot.add();
        fot.add(10,"500");
    }
}
