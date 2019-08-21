package com.tuxiaoer.shanghai.test1.stream;

import com.tuxiaoer.shanghai.test1.Fruit;
import com.tuxiaoer.shanghai.test1.FruitSelector;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/8/21 10:59
 */
public class StreamFruitSelector extends FruitSelector {

    @Override
    protected List<Double> doFilter(List<Fruit> fruits) {
                                // 将“苹果”筛选出来
        return fruits.stream().filter(f -> f.getName().equals(CANDIDATE_FRUIT))
                // 比较价格，进行排序
                .sorted(Comparator.comparing(Fruit::getPrice))
                // 返回一个流，该流由将给定函数应用于该流的元素的结果组成
                .map(Fruit::getPrice)
                // 产生一个集合
                .collect(Collectors.toList());

    }
}
