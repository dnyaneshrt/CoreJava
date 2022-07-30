package oops_programs;

import inheritance.ProtectedTest;

import java.util.Scanner;

public class ArmStrong extends ProtectedTest{

    public String checkArmStrong(int num)
    {
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(temp==sum)
        {
            return "it's an ArmString Number";
        }else {
            return "it's not an ArmString Number";
        }
    }
    public static void main(String[] args) {
        //code to access protected properties.
        ArmStrong am=new ArmStrong();
        System.out.println("from ProtectedTest class");
        System.out.println("id :"+am.id);
        System.out.println("name: "+am.name);
       /* Scanner sc=new Scanner(System.in);
         System.out.println("enter any number:");
        int num=sc.nextInt();

        ArmStrong am=new ArmStrong();
        String result=am.checkArmStrong(num);// calling method by passing value
        System.out.println(result);
*/
    }
}
