package com.ishan.java.designpatterns.strategic.right;

public class RubberDuck extends Duck {

  public RubberDuck(FlyBehaviour flyBehaviour) {
    setFlyBehaviour(flyBehaviour);
  }

  @Override
  public void display() {
    System.out.println("I am a Rubber Duck");
  }

}
