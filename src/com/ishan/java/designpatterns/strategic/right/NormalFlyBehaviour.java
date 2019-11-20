package com.ishan.java.designpatterns.strategic.right;

public class NormalFlyBehaviour implements FlyBehaviour {

  @Override
  public void fly() {
    System.out.println("I am flying");
  }

}
