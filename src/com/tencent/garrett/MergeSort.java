package com.tencent.garrett;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = mergeSort(new int[]{6, 3, 4, 1, 6, 3, 2, 5});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    public static int[] mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return arr;
        }
        int mid = (right - left) / 2 + left; //先做减法再做加法，避免直接加法导致溢出
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        return mergeArray(arr, left, mid, right);
    }

    public static int[] mergeArray(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index] = arr[i];
                i++;
            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }

        while (mid >= i) {
            temp[index] = arr[i];
            i++;
        }

        while (right >= j) {
            temp[index] = arr[j];
            j++;
        }
        int start = left;
        while (start <= right) {
            arr[start] = temp[start - left];
            start++;
        }
        return arr;
    }

}
