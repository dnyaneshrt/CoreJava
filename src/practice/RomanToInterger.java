package practice;

import java.util.Scanner;

public class RomanToInterger {

    public static void romanToInt(String rnum)//LX
    {
        int len = rnum.length();//2
        int sum=0;
        for (int i = 0; i < len; i++)//01
        {
            int s1 = getValue(rnum.charAt(i));
            if (i + 1 < len) {
              int s2=getValue(rnum.charAt(i+1));
                    if(s1>=s2)
                        sum=sum+s1;
                    else
                        sum=sum-s1;

            } else {
               sum=sum+s1;
            }
        }
    System.out.println("sum:"+sum);
    }

    static int getValue(char ch)
    {
        if(ch=='I'||ch=='i')
            return 1;
        if(ch=='V'||ch=='v')
            return 5;
        if(ch=='X'||ch=='x')
            return 10;
        if(ch=='L'||ch=='L')
            return 50;
        if(ch=='C'||ch=='c')
            return 100;

        return -1;
    }

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("enter any roman number:");
        String romanNumber=sc.next();

       romanToInt(romanNumber);//XL  X=10  L=50   50-10=40

    }
}
