package com.tuxiaoer.shanghai.test1;

import com.tuxiaoer.shanghai.test1.normal.IteratorFruitSelector;
import com.tuxiaoer.shanghai.test1.stream.StreamFruitSelector;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/8/21 10:52
 */
public class Test {
    public static void main(String[] args) {
        // 普通迭代
        IteratorFruitSelector iteratorFruitSelector = new IteratorFruitSelector();
        System.out.println(iteratorFruitSelector.select());

        // stream方法
        StreamFruitSelector streamFruitSelector = new StreamFruitSelector();
        System.out.println(streamFruitSelector.select());
    }
}
