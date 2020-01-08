package com.ishan.java.designpatterns.adapter.example1;

class MallardDuck implements Duck {
  @Override
  public void quack() {
    System.out.println("Quack!");
  }

  @Override
  public void fly() {
    System.out.println("Fly Fly!");
  }
}
