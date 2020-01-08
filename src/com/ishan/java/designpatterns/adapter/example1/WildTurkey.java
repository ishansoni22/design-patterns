package com.ishan.java.designpatterns.adapter.example1;

class WildTurkey implements Turkey {
  @Override
  public void gobble() {
    System.out.println("Gobble!");
  }

  @Override
  public void fly() {
    System.out.println("Fly Fly in short spurts!");
  }
}
