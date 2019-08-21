package com.tuxiaoer.shanghai.test2;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/8/21 11:31
 */
public class Test {

    @org.junit.Test
    public void test1() {
        long startTime = System.currentTimeMillis();
        int start = 0;
        int end = 1500000;
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        System.out.println("Tradition Result:" + sum + ",speed time:"+(System.currentTimeMillis()-startTime));
    }
}
