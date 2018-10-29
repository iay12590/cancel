package com.warden.leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 30. Substring with Concatenation of All Words:
 *
 * @author warden
 * @version 1.0.0
 * @date 2018/10/25
 */
public class Substring {

    public static void main(String[] args) {
//        String s = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababab";
//        String[] words = {"dhvf","sind","ffsl","yekr","zwzq","kpeo","cila","tfty","modg","ztjg","ybty","heqg","cpwo","gdcj","lnle","sefg","vimw","bxcb"};
//        System.out.println(s.indexOf(words[0]));
//        String  s = "ababbabaabab";
//        String[] words ={"ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba","ab","ba"};
        String s = "foofoobarandbarfoo";
        String[] words = {"foo", "bar"};
        System.out.println(new Substring().findSubstring2(s, words));
    }

    private int wordTotalLength = -1;

    private Set<String> indexSet = new HashSet<>();

    public List<Integer> findSubstring2(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        if (s == null || words == null || words.length == 0 || s.length() < words[0].length() * words.length) return res;
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> cur = new HashMap<>();
        for (String word: words) {
            if (!map.containsKey(word)) map.put(word, 0);
            map.put(word, map.get(word) + 1);
        }
        int m = words[0].length(), n = s.length(), num = words.length;
        for (int i = 0; i < m; i++) {
            int left = i, right = i, cnt = 0;
            cur.clear();
            for (; right + m <= n; right += m) {
                String sub = s.substring(right, right + m);
                if (!map.containsKey(sub)){
                    cur.clear();
                    cnt = 0;
                    left = right + m;
                } else {
                    if (!cur.containsKey(sub)) {
                        cur.put(sub, 0);
                    }
                    cur.put(sub, cur.get(sub) + 1);
                    cnt++;
                    //current String container more fragment than words
                    //left + m util cur.get(sub) = map.get(sub)
                    while (cur.get(sub) > map.get(sub)) {
                        String leftSub = s.substring(left, left + m);
                        cur.put(leftSub, cur.get(leftSub) - 1);
                        cnt--;
                        left += m;
                    }
                    if (cnt == num) res.add(left);
                }
            }
        }
        return res;
    }

    /**
     * 效率太低
     */
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null) {
            return null;
        }
        if (words.length < 1) {
            return new ArrayList<>();
        }
        Set<Integer> result = new HashSet<>();
        boolean[] flag = new boolean[words.length];
        List<Integer> tempResult = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        findSubString(s, 0, words, flag, result, 0, tempResult,sb);
        return new ArrayList<>(result);
    }

    private void findSubString(String s, int index, String[] words, boolean[] flag, Set<Integer> result, int pos,
                               List<Integer> tempResult, StringBuilder sb) {
        if (index == -1 || pos > words.length) {
            return;
        }
        if (tempResult.size() == words.length) {
            result.add(tempResult.get(0));
        }
        boolean isUsed;
        List<Integer> firstIndex;
        Set<String> handledWord = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            isUsed = flag[i];
            sb.append(words[i]);
            if (indexSet.contains(sb.toString())) {
                sb.delete(sb.length() - words[i].length(), sb.length());
                continue;
            }
            if (!isUsed) {
                flag[i] = true;
                if (pos == 0) {

                    if (indexSet.contains(words[i])) {
                        continue;
                    }
                    firstIndex = getAllIndex(s, words[i], 0);
                    indexSet.add(words[i]);
                    for (Integer startIndex : firstIndex) {
                        if (s.length() - getWordTotalLength(words) < index) {
                            continue;
                        }
                        tempResult.add(startIndex);
                        findSubString(s, startIndex + words[i].length(), words, flag, result, pos+1, tempResult, sb);
                        tempResult.remove(tempResult.size() - 1);
                    }
                } else {
                    if (s.startsWith(words[i], index) && !handledWord.contains(words[i])) {
                        handledWord.add(words[i]);
                        tempResult.add(index);
                        findSubString(s, index + words[i].length(), words, flag, result, pos+1, tempResult, sb);
                        tempResult.remove(tempResult.size() - 1);
                    }

                }
                sb.delete(sb.length() - words[i].length(), sb.length());
                flag[i] = false;
            }
        }
    }

    private List<Integer> getAllIndex(String source, String target, int start) {
        List<Integer> result = new ArrayList<>();
        int index = source.indexOf(target, start);
        while(index != -1) {
            result.add(index);
            index++;
            if (index > source.length() -1) {
                break;
            }

            index = source.indexOf(target, index);
        }
        return result;
    }

    private List<String> getAllString(String[] strings) {
        boolean[] flag = new boolean[strings.length];
        List<String> list = new ArrayList<>();
        List<String> path = new ArrayList<>();
        getAllString(strings, flag, list, path);
        return list;
    }
    private void getAllString(String[] strings, boolean[] flag, List<String> result, List<String> path) {
        if (path.size() == strings.length) {
            result.add(listToString(path));
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]) {
                path.add(strings[i]);
                flag[i] = true;
                getAllString(strings, flag, result, path);
                flag[i] = false;
                path.remove(path.size() - 1);
            }

        }
    }

    private String listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        return sb.toString();
    }

    private int getWordTotalLength(String[] words) {
        if (wordTotalLength != -1 || words == null) {
            return wordTotalLength;
        }
        wordTotalLength = 0;
        for (String s : words) {
            wordTotalLength += s.length();
        }
        return wordTotalLength;
    }

}
