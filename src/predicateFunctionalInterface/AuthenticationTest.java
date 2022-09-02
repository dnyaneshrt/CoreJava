package predicateFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

class User
{
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
public class AuthenticationTest {
    public static void main(String[] args) {
        Predicate<User> p1=user->user.getUsername().equals("dnyanu")&&user.getPassword().equals("dnyanu");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter user name");
        String username=sc.next();

        System.out.println("enter password");
        String password=sc.next();

       if(p1.test(new User(username,password)))
       {
           System.out.println("Welcome!!!!! you are valid user");
       }else {
           System.out.println("invalid user, kindly try again");
       }


    }
}
