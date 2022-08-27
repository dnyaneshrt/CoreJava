package practice;


//we can never override constrctors in java? we can overload.
//java does not support multiple inheritance and hybrid inheritance.
class Parent
{
    public void parentProperty()
    {
        System.out.println("car,bankbalance");
    }
}
class Child extends Parent
{
    //instance
    public void childProperty()
    {
        System.out.println("toys,pocket money");
    }
    @Override
    public void parentProperty()
    {
        System.out.println("car,bankbalance,house");
        System.out.println("overridden code");
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        Child c=new Child();
        c.childProperty();
        c.parentProperty();//
    }
}
