package com.madr.dp.builderpattern;

import com.madr.dp.builderpattern.example01.Order;

public class BuilderPatternTest {

  public static void main (String [] args) {
    Order orderEmptyConstructor = new Order();
    System.out.println(orderEmptyConstructor);

    Order orderByConstructor = new Order("SpiderManToy", "20", "SERKS-SF23-2343-23", true);
    System.out.println(orderByConstructor);

    Order orderByBuilder = new Order.OrderBuilder("Tony Stark")
        .count("15")
        .sku("SKSD-234MSDF-234MSDF-23")
        .isSuccess(true)
        .build();
    System.out.println(orderByBuilder);
  }
} 