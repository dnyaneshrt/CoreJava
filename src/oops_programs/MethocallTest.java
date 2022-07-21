package oops_programs;

import basic_programs.Hello;

public class MethocallTest {
    public static void main(String[] args) {

        MethodTest m1=new MethodTest();
        m1.welcome();
        m1.welcome();
        m1.welcome();
        m1.welcome();

        String name=m1.getName("Dnyaneshwar");
        System.out.println(name);

        String name2=m1.getName("Infeanet");
        System.out.println(name2);

        //className.staticmethod()

        StaticMethods.welcome();// calling static methods
        System.out.println(StaticMethods.getName("Infeanet"));

        Hello h=new Hello();
        h.sayHello("Soham");
    }
}
