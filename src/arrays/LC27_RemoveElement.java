package arrays;

import java.util.Arrays;

public class LC27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int index = 0; // position for next element not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        // Example 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int k1 = removeElement(nums1, val1);
        System.out.println("k = " + k1);
        System.out.println("Result: " +
                Arrays.toString(Arrays.copyOf(nums1, k1)));

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        int k2 = removeElement(nums2, val2);
        System.out.println("k = " + k2);
        System.out.println("Result: " +
                Arrays.toString(Arrays.copyOf(nums2, k2)));
    }
}
