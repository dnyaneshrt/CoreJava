package practice;

//can we overload constructors in java?
public class Demo {
    Demo()
    {//zero param constrctor
        System.out.println("from zero param constructor");
    }
    Demo(int num1,int num2)
    {//parametirzed constrctor
        System.out.println("from paramterized constructor"+(num1+num2));
    }
    public static void main(String[] args) {
    Demo d= new Demo();//object creation.
    Demo d2=new Demo(10,15);
    }
}
