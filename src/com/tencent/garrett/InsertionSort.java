package com.tencent.garrett;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = insertionSort(new int[]{6, 3, 4, 1, 6, 3, 2, 5});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int temp = arr[i];
            for (; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                } else {
                    break;
                }
            }
            arr[j] = temp;
        }

        return arr;

    }

}
