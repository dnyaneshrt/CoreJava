package oops_programs;

public class ThisTest {
    int roll = 100;
    String name = "Dilip";
    String address = "Lohegaon";
    ThisTest() {
        this("Infeanet"); //call anather constructor System.out.println("from zero paramterized constrctor");
    }
    ThisTest(String name) {
        this(10, "abc");
        System.out.println("from paramterized constrctor: " + name);
    }
    ThisTest(int n, String name) {
        System.out.println("from paramterized constrctor: " + name + " value " + n);
    }
    public void displayInfo() {
        int roll = 200;
        String name = "Mohit";
        String address = "Viman Nagar";
        System.out.println("Roll no:" + roll);
        System.out.println("name:" + this.name); //this at variable level System.out.println("Address:"+address);
        this.testDemo(); // this at method level
    }
    public void testDemo() {
        System.out.println("called using this keyword.. i am testDemo()");
    }
    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        t.displayInfo();
    }
}