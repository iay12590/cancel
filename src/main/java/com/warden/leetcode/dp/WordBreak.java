package com.warden.leetcode.dp;

import java.util.Arrays;
import java.util.List;

/**
 * 139. Word Break
 * @author warden
 * @version 1.0.0
 * @date 2018/10/25
 */
public class WordBreak {

    public static void main(String[] args) {
        String s = "abacdefe";
        String a1 = "abac";
        String a2 = "defe";
        List<String> list = Arrays.asList(a1, a2);
        System.out.println(new WordBreak().wordBreak(s, list));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null && wordDict == null) {
            return true;
        }
        if (s == null || wordDict == null) {
            return false;
        }
        int maxLength = getMaxLength(wordDict);
        //dp[i] represents if s.substring(0, i) is wordbreakable.
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (i - j > maxLength) {
                    continue;
                }
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    private int getMaxLength(List<String> wordDict) {
        int max = 0;
        for (String str : wordDict) {
            max = Math.max(max, str.length());
        }
        return max;
    }

}
