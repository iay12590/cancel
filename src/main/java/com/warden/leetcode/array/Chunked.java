package com.warden.leetcode.array;

/**
 * 769. Max Chunks To Make Sorted
 * @author warden
 * @version 1.0.0
 * @date 2018/10/25
 */
public class Chunked {

    public static void main(String[] args) {
        int[] arr = {1,10,7,9, 11};
        System.out.println(maxChunksToSorted2(arr));
    }

    public static int maxChunksToSorted2(int[] arr) {
        int n = arr.length;
        int[] rightSmallest = new int[n];
        rightSmallest[n - 1] = Integer.MAX_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            smallest = Math.min(smallest, arr[i + 1]);
            rightSmallest[i] = smallest;
        }

        int cuts = 0;
        int largest = 0;
        for (int i = 0; i < n; i++) {
            largest = Math.max(arr[i], largest);
            if (largest < rightSmallest[i]) {
                cuts++;
                largest = 0;
            }
        }

        return cuts;
    }

    public static int maxChunksToSorted(int[] arr) {
        if (arr == null || arr.length < 1) {
            return 0;
        }
        int len = arr.length;
        int start = 0;
        int num = 0;
        int min;
        int max;
        int tempMax;
        while (start < len ) {
            min = max = tempMax = arr[start];
            for (int i = start + 1; i < len; i++) {
                int t = arr[i];
                if (t < max) {
                    min = Math.min(min, t);
                    max = tempMax;
                    start = i;
                } else if (t > max) {
                    tempMax = Math.max(t, tempMax);
                }
            }
            start++;
            num++;
        }
        return num;
    }
}
