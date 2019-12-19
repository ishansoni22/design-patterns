package com.ishan.java.designpatterns.builder.right;

public class Main {

  public static void main(String[] args) {
    Lunch lunch = new Lunch.Builder("Plain")
        .condiments("Lettuce")
        .dessert("Black Pepper")
        .build();

    System.out.println(lunch);
  }

}
