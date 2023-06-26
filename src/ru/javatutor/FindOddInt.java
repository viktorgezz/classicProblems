package ru.javatutor;

import java.util.HashMap;

public class FindOddInt {
    
    public static int findIt(int[] a) {
        HashMap<Integer, Integer> arrayRepetitive = new HashMap<>();
        for (int j : a) {
            if (!arrayRepetitive.containsKey(j)) {
                arrayRepetitive.put(j, 1);
            } else {
                int value = arrayRepetitive.get(j) + 1;
                arrayRepetitive.put(j, value);
            }
        }

        for (int key : arrayRepetitive.keySet()) {
            if (arrayRepetitive.get(key) % 2 != 0) {
                return key;
            }
        }
        return 0;
    }
}