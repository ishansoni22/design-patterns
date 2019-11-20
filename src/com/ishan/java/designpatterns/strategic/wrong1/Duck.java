package com.ishan.java.designpatterns.strategic.wrong1;

public abstract class Duck {

  abstract void display();

  public void quack() {
    System.out.println("Quack");
  }

  public void swim() {
    System.out.println("I am swimming");
  }

  public void fly() {
    System.out.println("I am flying");
  }

}