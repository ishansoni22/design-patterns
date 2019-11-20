package com.ishan.java.designpatterns.strategic.wrong2;

public class MallardDuck extends Duck implements Flyable, Quackable{

  @Override
  void display() {
    System.out.println("I am a Mallard Duck");
  }

}
