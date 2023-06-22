package ru.javatutor;

public class ZeroMax {

    public int[] zeroMax(int[] nums) {
        int maxOdd = Integer.MIN_VALUE;
        boolean wasOdd = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                maxOdd = Math.max(nums[i], maxOdd);
                wasOdd = true;
            }
            if (nums[i] == 0 && wasOdd) {
                nums[i] = maxOdd;
            }
        }
        return nums;
    }
}
