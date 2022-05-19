package com.tencent.garrett;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = selectionSort(new int[]{6, 3, 4, 1, 6, 3, 2, 5});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
        return arr;

    }
}
