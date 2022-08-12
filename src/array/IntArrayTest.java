package array;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 333;
        nums[1] = 6;
        nums[2] = 556;
        nums[3] = 5678;
        nums[4] = 569;
        int temp = nums[0];
        int temp2 = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (temp < nums[i]) {
                temp = nums[i];
            }
            if (temp2 > nums[i]) {
                temp2 = nums[i];
            }
        }
        System.out.println("Largest value from my array is:" + temp);
        System.out.println("smallest value from my array is:" + temp2);
    }
}