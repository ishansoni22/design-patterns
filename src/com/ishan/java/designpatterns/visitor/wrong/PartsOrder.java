package com.ishan.java.designpatterns.visitor.wrong;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvPart {

  private List<AtvPart> parts = new ArrayList<>();

  @Override
  public double calculateShipping() {
    double shipping = 0;
    for (AtvPart part: parts) {
      shipping += part.calculateShipping();
    }
    return shipping;
  }

  public void addPart(AtvPart part) {
    parts.add(part);
  }
}
