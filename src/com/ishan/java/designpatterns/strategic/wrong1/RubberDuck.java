package com.ishan.java.designpatterns.strategic.wrong1;

public class RubberDuck extends Duck {

  @Override
  void display() {
    System.out.println("I am a Rubber Duck");
  }

  @Override
  public void quack() {
    System.out.println("Squeak");
  }

  /**
   * We can override the fly() method here so that the rubber duck doesn't fly
   */

}
