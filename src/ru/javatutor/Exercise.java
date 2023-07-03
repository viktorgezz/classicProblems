package ru.javatutor;

public class Exercise {
    public int[] makeMiddle(int[] nums) {
        int middleIndex = nums.length / 2;
        return new int[]{nums[middleIndex - 1], nums[middleIndex]};
    }
}
