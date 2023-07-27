package ru.javatutor;

public class SortingPlanetTwisted37 {
    public static Integer[] sortTwisted37(Integer[] array) {
        Integer[] res = new Integer[array.length];
        System.arraycopy(array, 0, res, 0, array.length);
        replace3To7InArray(res);
        res = sort(res);
        replace3To7InArray(res);
        return res;
    }

    private static Integer[] sort(Integer[] values) {
        if (values == null || values.length == 0) {
            return values;
        }
        int len = values.length - 1;
        quicksort(0, len, values);
        return values;
    }

    private static void quicksort(int low, int high, Integer[] numbers) {
        int i = low, j = high;
        int pivot = numbers[low + (high - low) / 2];

        while (i <= j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quicksort(low, j, numbers);
        if (i < high)
            quicksort(i, high, numbers);
    }

    private static Integer[] replace3To7InArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].toString().contains("3") || array[i].toString().contains("7")) {
                array[i] = replace3To7InNum(array[i].toString());
            }
        }
        return array;
    }

    private static Integer replace3To7InNum(String num) {
        String res = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '3') {
                res += '7';
                continue;
            }
            if (num.charAt(i) == '7') {
                res += '3';
                continue;
            }
            res += num.charAt(i);
        }
        return Integer.parseInt(res);
    }
}

