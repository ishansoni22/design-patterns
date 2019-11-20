package com.ishan.java.designpatterns.strategic.right;

public abstract class Duck {

  public abstract void display();

  public void swim() {
    System.out.println("I am swimming");
  }

  public void fly() {
    this.flyBehaviour.fly();
  }

  private FlyBehaviour flyBehaviour;

  protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

}
