package com.warden.leetcode.loop;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * @author warden
 * @version 1.0.0
 * @date 2018/10/23
 */
public class Combine {

    public static void main(String[] args) {
        Combine combine = new Combine();
        System.out.println(combine.combine(4,3));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(1, n, k, path, result);
        return result;
    }

    private void dfs(int pos, int n, int k, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (pos > n || path.size() + n - pos + 1 < k) {
            return;
        }
        path.add(pos);
        dfs(pos + 1, n, k, path, result);
        path.remove(path.size() - 1);
        dfs(pos + 1, n, k, path, result);
    }



}
