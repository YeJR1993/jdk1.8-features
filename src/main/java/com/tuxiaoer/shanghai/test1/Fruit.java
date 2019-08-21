package com.tuxiaoer.shanghai.test1;

import lombok.Data;

/**
 * @author YeJR
 * @version 1.0
 * @date 2019/8/21 10:25
 */
@Data
public class Fruit {

    private final String name;

    private final double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
