package com.ishan.java.designpatterns.visitor.right;

public class Oil implements AtvPart {

  @Override
  public void accept(AtvPartVisitor visitor) {
    visitor.visit(this);
  }
}
