package com.warden.leetcode.Linked;

import java.util.HashSet;
import java.util.Set;

/**
 * @author warden
 * @version 1.0.0
 * @date 2018/10/23
 */
public class SinglyLinked {

    public static void main(String[] args) {

    }

    public int numComponents(ListNode head, int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        int len = array.length;
        int finish = 0;
        int num = 0;
        boolean component = false;
        while (head != null && finish < len) {
            if (set.contains(head.getVal())) {
                if (!component) {
                    num++;
                }
                finish++;
                component = true;
            } else {
                component = false;
            }
        }
        return num;
    }

    public int numComponents2(ListNode head, int[] G) {
        boolean[] array = new boolean[G.length];
        for (int i : G) {
            array[i] = true;
        }
        int len = array.length;
        int finish = 0;
        int num = 0;
        boolean component = false;
        while (head != null && finish < len) {
            if ( array[head.getVal()]) {
                if (!component) {
                    num++;
                }
                finish++;
                component = true;
            } else {
                component = false;
            }
        }
        return num;
    }
}

class ListNode {
    private int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
