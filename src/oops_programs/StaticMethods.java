package oops_programs;

public class StaticMethods {

    void  test()
    {
        System.out.println("test called");
    }
    public static void welcome()
    {
        System.out.println("welcome everyone!!! from static method");
    }

    //instance method.
    public static String getName(String name)
    {
        return "Good Job "+name+" from static method";
    }

    public static void main(String[] args) {
        System.out.println("method call from same class");
          // StaticMethods.welcome();
         welcome();//bcause it's in same class

        StaticMethods st=new StaticMethods();
        st.test();

    }
}
