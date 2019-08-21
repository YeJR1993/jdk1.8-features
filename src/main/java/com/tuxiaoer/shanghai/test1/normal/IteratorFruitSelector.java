package com.tuxiaoer.shanghai.test1.normal;

import com.tuxiaoer.shanghai.test1.Fruit;
import com.tuxiaoer.shanghai.test1.FruitSelector;

import java.util.*;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/8/21 10:33
 */
public class IteratorFruitSelector extends FruitSelector {

    protected List<Double> doFilter(List<Fruit> fruits) {
        // 筛选
        List<Fruit> appleList = new ArrayList<>();
        Iterator<Fruit> iterator = fruits.iterator();
        for (; iterator.hasNext();) {
            Fruit fruit = iterator.next();
            if (Objects.equals(fruit.getName(), CANDIDATE_FRUIT)) {
                appleList.add(fruit);
            }
        }
        // 排序
        // 传入的集合对象需要重写compare(T o1, T o2) 方法
        // 正整数	当前对象的值 > 比较对象的值 ， 位置排在后
        // 零	当前对象的值 = 比较对象的值 ， 位置不变
        // 负整数	当前对象的值 < 比较对象的值 ， 位置排在前
        Collections.sort(appleList, ((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) return 1;
            else if (o1.getPrice() == o2.getPrice()) return 0;
            else return -1;
        }));
        // 选择
        List<Double> applePriceList = new ArrayList<>();
        for (Fruit fruit : appleList) {
            applePriceList.add(fruit.getPrice());
        }

        return applePriceList;
    }

}
