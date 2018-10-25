package com.warden.leetcode.string;

import java.util.Objects;

/**
 * 344. Reverse String
 * @author warden
 * @version 1.0.0
 * @date 2018/10/24
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "2";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        int len = str.length();
        char[] chars = new char[len];
        for (int i = len -1; i >=0; i--) {
            chars[len-i-1] = str.charAt(i);
        }
        return new String(chars);
    }

}
