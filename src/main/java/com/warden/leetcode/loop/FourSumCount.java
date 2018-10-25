package com.warden.leetcode.loop;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author warden
 * @version 1.0.0
 * @date 2018/10/25
 */
public class FourSumCount {

    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {-2,-1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        FourSumCount count = new FourSumCount();
        System.out.println(count.fourSumCount(a, b, c, d));
    }

    /**
     * a, b, c, d 长度一致
     */
    public int fourSumCount(int[] a, int[] b, int[] c, int[] d) {
        if (a == null || a.length < 1) {
            return 0;
        }
        int len = a.length;
        int sum;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                sum = a[i] + b[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int result = 0;
        for (int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                sum = c[i] + d[j];
                result += map.getOrDefault(-sum, 0);
            }
        }
        return result;
    }



}
