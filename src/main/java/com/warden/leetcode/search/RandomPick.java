package com.warden.leetcode.search;

import java.util.Random;

/**
 * @author warden
 * @version 1.0.0
 * @date 2018/10/23
 */
public class RandomPick {

    public static void main(String[] args) {
        double d = Math.random();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            int i = random.nextInt(10);
            System.out.println(i);
        }
    }
}
