package com.warden.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * @author <a href="linjianhua@wxchina.com">JianHua.Lin</a>
 * @version 1.0.0
 * @date 2018/10/19
 */
public class ThreeSum {

    private static Map<Integer, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = {-2, 1, 1, 1, -2};
        List<List<Integer>> lists = solve(nums);
        System.out.println(lists);
    }

    private static List<List<Integer>> solve(int[] nums) {
        if (null == nums || nums.length < 3) {
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            solve(nums, i, list);
        }
        return list;
    }

    /**
     * nums按从小到大排序
     */
    private static void solve(int[] nums, int start, List<List<Integer>> result) {
        if (null == nums || nums.length - start < 2) {
            return;
        }
        int left = start + 1;
        int right = nums.length - 1;
        int target = -nums[start];
        int sum;
        List<Integer> temp;
        while (left < right) {
             sum = nums[left] + nums[right];
             if (sum == target) {

                 temp = Arrays.asList(nums[start], nums[left++], nums[right--]);
                 result.add(temp);
                 while (left < right && nums[left] == nums[left - 1]) {
                     left++;
                 }
                 while (left < right && nums[right] == nums[right + 1]) {
                     right--;
                 }
             }
             if (nums[left] + nums[right] < target) {
                left++;
             }
            if (nums[left] + nums[right] > target) {
                right--;
            }

        }
    }

}
