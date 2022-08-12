package array;

public class ArrayFirstTest {
    public static void main(String[] args) {
        String[] names = new String[5]; //String array declaration
        // String default value is null names[0]="Amit";
        names[1] = "yogesh";
        names[2] = "mohit";
        names[3] = "rohit";
        names[4] = "rahul";
        //array initialization using index
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}