package ru.javatutor;

import java.util.HashMap;
import java.util.Map;

public class FindOddInt {
    
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : a) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return key;
            }
        }
        return 0;
    }
}