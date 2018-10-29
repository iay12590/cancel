package com.warden.leetcode.string;

/**
 * @author warden
 * @version 1.0.0
 * @date 2018/10/26
 */
public class StringTest {

    public static void main(String[] args) {

        String t = "a" + "b" + new InnerClass("ss").getName();
    }

}
class InnerClass {
    private String name;

    public InnerClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
