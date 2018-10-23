package com.warden.leetcode.util;

/**
 * @author <a href="linjianhua@wxchina.com">JianHua.Lin</a>
 * @version 1.0.0
 * @date 2018/5/10
 */
public class PrintUtil {

    public static void printArray(int[] array) {
        if (null == array) {
            return;
        }
        System.out.println("array is :");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }

}
