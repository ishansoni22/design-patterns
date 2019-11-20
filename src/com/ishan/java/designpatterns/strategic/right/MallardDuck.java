package com.ishan.java.designpatterns.strategic.right;

public class MallardDuck extends Duck{

  public MallardDuck(FlyBehaviour flyBehaviour) {
    setFlyBehaviour(flyBehaviour);
  }

  @Override
  public void display() {
    System.out.println("I am a Mallard Duck");
  }

}
