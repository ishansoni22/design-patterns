package com.ishan.java.designpatterns.strategic.wrong2;

public interface Quackable {

  default void quack() {
    System.out.println("Quack");
  }

}
