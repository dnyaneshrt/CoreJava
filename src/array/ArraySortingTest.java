package array;

import java.util.Scanner;
public class ArraySortingTest {
    int[] sortMyArrayAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    int[] sortMyArrayDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("please enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        ArraySortingTest obj = new ArraySortingTest();
        int[] sortedArrayAsc = obj.sortMyArrayAsc(nums);
        System.out.println("Array after sorting in Asceding order using bubble sort as follows");
        for (int i = 0; i < size; i++) {
            System.out.println(sortedArrayAsc[i]);
        }
        int[] sortedArrayDesc = obj.sortMyArrayDesc(nums);
        System.out.println("Array after sorting in desc order using bubble sort as follows");
        for (int i = 0; i < size; i++) {
            System.out.println(sortedArrayDesc[i]);
        }
    }
}