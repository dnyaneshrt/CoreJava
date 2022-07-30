package array;

import java.util.Scanner;
class ArrayTest
{
    public int calculateAvg(int[] marks)
    {
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        int avg=sum/marks.length;
        return avg;
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of subjects:");
        int size=sc.nextInt();

        int[] marks=new int[size];

        System.out.println("Enter marks:");
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }

        ArrayTest m=new ArrayTest();
        int avg=m.calculateAvg(marks);//passing array by functiom
        System.out.println("avg marks of "+size+" studens are :"+avg);
    }
}