package com.tencent.garrett;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = shellSort(new int[]{6, 3, 4, 1, 6, 3, 2, 5});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shellSort(int arr[]) {
        if (arr == null || arr.length < 2) {
            return arr;
        }

//        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
//
//            for (int i = gap; i < arr.length; i++) {
//
//                for (int j = 0; j < ; j--) {
//
//                }
//
//            }
//
//        }

        return arr;
    }
}
