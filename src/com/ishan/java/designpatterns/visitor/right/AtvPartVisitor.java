package com.ishan.java.designpatterns.visitor.right;

public interface AtvPartVisitor {

  void visit(Oil oil);

  void visit(Wheel wheel);

  void visit(PartsOrder partsOrder);
}
