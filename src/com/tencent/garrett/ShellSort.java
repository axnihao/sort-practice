package com.tencent.garrett;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = shellSort(new int[]{6, 3, 4, 1, 6, 3, 2, 5});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shellSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                for (; j + 1 > gap; j -= gap) {  // j+1>gap关键
                    if (temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                    } else {
                        break;
                    }
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
}
