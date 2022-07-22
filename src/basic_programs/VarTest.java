package basic_programs;

public class VarTest {
    public static int num1=100;// static variable
    public int num2=100;//instance variable

    VarTest()
    {
    int num;//local variable
    }
    public static void main(String[] args) {

      System.out.println(VarTest.num1);

    }
}
class Test
{
    void display()
    {
        VarTest.num1=100;
    }
}