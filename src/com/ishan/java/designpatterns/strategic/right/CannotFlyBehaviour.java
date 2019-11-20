package com.ishan.java.designpatterns.strategic.right;

public class CannotFlyBehaviour implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("Cannot fly");
  }

}
