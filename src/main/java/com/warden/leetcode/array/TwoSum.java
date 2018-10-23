package com.warden.leetcode.array;

import com.warden.leetcode.util.PrintUtil;

import java.util.HashMap;
import java.util.Map;


/**
 * @author <a href="linjianhua@wxchina.com">JianHua.Lin</a>
 * @version 1.0.0
 * @date 2018/5/10
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] a = {-1, 3, 7, 10, 9};
        int[] b = solve(a, 9, 0);
        PrintUtil.printArray(b);
    }

    private static int[] solve(int[] nums, int target, int start) {
        if (null == nums || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        Integer temp;
        for (int i = start; i < nums.length; i ++) {
            temp = map.get(nums[i]);
            if (temp != null) {
                return new int[]{temp, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }



}
