package interview_coding_practice;

import java.util.Set;
import java.util.TreeSet;

public class ArrayIntersection {
    private static void findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
//            code snippet to find common elements from both array.
           /* if(set.contains(arr2[i]))
                System.out.println(arr2[i]);*/
            set.add(arr2[i]);
        }
        System.out.print(set);
    }
    public static void main(String[] args) {
        int[] arr1={10,20,30,50,60,25,45};
        int[] arr2={25,45,112,234,455,30};

        findCommonElements(arr1,arr2);

    }


}
