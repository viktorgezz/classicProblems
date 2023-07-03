package ru.javatutor;

public class Exercise {
    public int[] makeMiddle(int[] nums) {
        int[] numsMiddle = new int[2];
        numsMiddle[0] = nums[(nums.length - 1) / 2];
        numsMiddle[1] = nums[(nums.length - 1) / 2 + 1];
        return numsMiddle;
    }
}
