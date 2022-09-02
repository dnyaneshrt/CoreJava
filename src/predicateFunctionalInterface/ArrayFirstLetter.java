package predicateFunctionalInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class ArrayFirstLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("please enter names:");

        String[] names=new String[size];

        for(int i=0;i< names.length;i++)
        {
          names[i]=sc.next();
        }
        Predicate<String> p1=s->s.charAt(0)=='A';//predicate using lamda expression

        System.out.println("names starts with letter 'A' as follows");
        for(String s:names)
        {
            if(p1.test(s))
            {
                System.out.println(s);
            }
        }


    }
}
