package com.madr.dp.builderpattern.example01;

import java.util.UUID;

/**
 * We use simple Order POJO with Builder pattern.
 * 
 * In normal case, we need to pass the variables in the constructors.
 * With increasing number of class variables, it will be hard to maintain the order.
 * Also in some cases we need to pass null values which is completely annoying.
 * 
 * To fix this we use the BuilderPattern.
 */
public class Order {

  public Order() {
    this.id = UUID.randomUUID().toString();
  }

  public Order(String name, String count, String sku, boolean isSuccess) {
    this();
    this.name = name;
    this.count = count;
    this.sku = sku;
    this.isSuccess = isSuccess;
  }

  public Order(OrderBuilder orderBuilder) {
    this();
    this.name = orderBuilder.name;
    this.count = orderBuilder.count;
    this.sku = orderBuilder.sku;
    this.isSuccess = orderBuilder.isSuccess;
  }

  private String id;

  private String name;

  private String count;

  private String sku;

  private boolean isSuccess;

  public String getId() {
    return id;
  }

  public boolean isSuccess() {
    return isSuccess;
  }

  public void setSuccess(boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Order: [ id: " + this.id + ", name: " + this.name + ", count: " + this.count +
      ", sku: " + this.sku + ", success: " + this.isSuccess + "]"; 
  }

  public static class OrderBuilder {
    private String name;
    private String count;
    private String sku;
    private boolean isSuccess;

    public OrderBuilder(String name) {
      this.name = name;
    }

    public OrderBuilder count(String count) {
      this.count = count;
      return this;
    }

    public OrderBuilder sku(String sku) {
      this.sku = sku;
      return this;
    }

    public OrderBuilder isSuccess(boolean isSuccess) {
      this.isSuccess = isSuccess;
      return this;
    }

    public Order build() {
      return new Order(this);
    }
  }
}

