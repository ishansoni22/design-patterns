package com.ishan.java.designpatterns.visitor.right;

public class Wheel implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
