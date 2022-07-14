package basic_programs;

import java.util.Scanner;

public class UserInputTest {
    public static void main(String[] args) {

        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter your name:");
            String name = sc.nextLine();

            System.out.println("Please enter your roll number:");
            int roll = sc.nextInt();

            System.out.println("Please enter your marks:");
            float marks = sc.nextFloat();

            System.out.println("Please enter day:");
            byte day = sc.nextByte();

            String res = "";
            System.out.println("Please enter your result (true/false)");
            boolean result = sc.nextBoolean();
            if (result == true) {
                res = "pass";
            } else {
                res = "fail";
            }

            System.out.println("Enter gender");
            char gender = sc.next().charAt(0);

            System.out.println("**Student Details are as follows:**");
            System.out.println("Student name= " + name);
            System.out.println("Student roll number= " + roll);
            System.out.println("Student marks= " + marks);
            System.out.println("Student day= " + day);
            System.out.println("Student result= " + res);
            System.out.println("Student gender= " + gender);


        }

    }
}
