package com.ishan.java.designpatterns.visitor.right;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {

  private List<AtvPart> parts = new ArrayList<>();

  public void addPart(AtvPart part) {
    parts.add(part);
  }

  @Override
  public void accept(AtvPartVisitor visitor) {

    for(AtvPart part : parts) {
      part.accept(visitor);
    }
    visitor.visit(this);
  }

}
