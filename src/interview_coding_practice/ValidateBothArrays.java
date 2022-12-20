package interview_coding_practice;

import java.util.Arrays;

public class ValidateBothArrays {
    public static void main(String[] args) {

        int[] nums1={1,3,5,2,4};
        int[] nums2={1,2,3,4,5};

        if(checkBothArrays(nums1,nums2))
            System.out.println("both array contains same values");
        else
            System.out.println("both arrays contains different values:");

    }

    private static boolean checkBothArrays(int[] nums1, int[] nums2) {

        int l1= nums1.length;
        int l2=nums2.length;

        if(l1!=l2)
            return false;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0;i<l1;i++)
        {
            if(nums1[i]!=nums2[i])
                return false;
        }

        return true;
    }
}
