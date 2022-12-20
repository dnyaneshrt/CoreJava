package interview_coding_practice;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,8,9,10};
        findMissingNumber(nums);
    }

    private static void findMissingNumber(int[] nums) {
        int sum=(10*11)/2;
        int sumOfArray=0;
        for(int i=0;i< nums.length;i++)
        {
            sumOfArray=sumOfArray+nums[i];
        }
        System.out.println("Missing number from above array is :"+(sum-sumOfArray));
    }
}
