package com.ishan.java.designpatterns.visitor.right;

public class main {
  public static void main(String[] args) {
    PartsOrder order = new PartsOrder();
    order.addPart(new Oil());
    order.addPart(new Wheel());

    order.accept(new AtvPartShippingVisitor());

  }
}
