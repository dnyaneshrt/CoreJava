package basic_programs;


import java.util.Scanner;

public class SwitchTest2 {

    public static void main(String[] args) {
        int count=1;
        while(true)
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("List of movies are below:: "+count++);
        System.out.println("1. Bahubali");
        System.out.println("2. KGF 2");
        System.out.println("3. Pushpa");
        System.out.println("4. thenun");
        System.out.println("5. Spiderman");
        System.out.println("6. shersha");

        System.out.println("please select your name:");
        String name=sc.nextLine();// accept String value from user

        System.out.println("please select movie name:");
        int number=sc.nextInt();// accept int value from user

        switch(number)
        {
            case 1: System.out.println(name+"  will go for bahubali"); break;
            case 2: System.out.println(name+"  will go for KGF 2"); break;
            case 3: System.out.println(name+"  will go for Pushpa"); break;
            case 4: System.out.println(name+"  will go for thenun"); break;
            case 5: System.out.println(name+"  will go for Spideman"); break;
            case 6: System.out.println(name+"  will go for shershah"); break;

            default:
                System.out.println(name+" will go home");

        }

        System.out.println("Do you want to continue?enter  Y/N");
        char ch=sc.next().charAt(0);
        if(ch=='Y' || ch=='y')
        {
            continue;
        }if(ch=='n' || ch=='N'){
            break;
        }


        }


    }
}
