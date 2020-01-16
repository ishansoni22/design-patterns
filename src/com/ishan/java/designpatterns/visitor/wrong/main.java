package com.ishan.java.designpatterns.visitor.wrong;

public class main {
  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Oil());
    order.addPart(new Wheel());

    System.out.println(order.calculateShipping());

  }
}
