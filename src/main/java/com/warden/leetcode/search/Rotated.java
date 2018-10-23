package com.warden.leetcode.search;

/**
 * 从排好序或者旋转过一次的数组中快速查找某个数
 * @author <a href="linjianhua@wxchina.com">JianHua.Lin</a>
 * @version 1.0.0
 * @date 2018/10/22
 */
public class Rotated {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7,8, 1, 2, 3};
        System.out.println(search(nums, 1));
    }

    private static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        return search2(nums, target, 0, nums.length - 1);
    }


    private static int search2(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                //往后找只有一种可能
                if (nums[start] > nums[end] && nums[start] > target && nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid -1;
                }
            } else {
                //往前找只有一种可能
                if (nums[start] > nums[end] && nums[end] < target && nums[mid] < nums[start]) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
