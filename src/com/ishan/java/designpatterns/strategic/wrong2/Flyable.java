package com.ishan.java.designpatterns.strategic.wrong2;

public interface Flyable {

  default void fly() {
    System.out.println("I am flying");
  }

}
