package com.ishan.java.designpatterns.visitor.right;

public class AtvPartShippingVisitor implements AtvPartVisitor {

  private double shipping = 0;

  @Override
  public void visit(Oil oil) {
    shipping += 5;
  }

  @Override
  public void visit(Wheel wheel) {
    shipping += 10;
  }

  @Override
  public void visit(PartsOrder partsOrder) {
    System.out.println("Shipping amount is : " + shipping);

  }
}
