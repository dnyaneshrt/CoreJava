package functional_interfaces;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuthTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter username");
        String  username=sc.next();
        System.out.println("enter password");
        String  password=sc.next();
        Function<String,String> f1=s->s.toLowerCase();
        Function<String,String> f2=s->s.substring(0,6);

        System.out.println("username: "+f1.andThen(f2).apply(username)+": "+username);
        System.out.println("password: "+f1.apply(password)+": "+password);
        if(f1.andThen(f2).apply(username).equals("dnyanu")&&f1.apply(password).equals("dts"))
        {
            System.out.println("it is valid user");
        }else {
            System.out.println("invalid user! try again...");
        }


    }
}
