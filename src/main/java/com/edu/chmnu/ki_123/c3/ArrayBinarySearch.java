package com.edu.chmnu.ki_123.c3;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 30, 57, 7, 9, 101, 13};
        int key = 15;

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key " + key + " not found");
        }
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}