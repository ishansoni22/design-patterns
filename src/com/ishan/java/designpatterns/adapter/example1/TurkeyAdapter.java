package com.ishan.java.designpatterns.adapter.example1;

/**
 * Let's say we are short on Duck objects and would like to use Turkey objects.
 * We can't use Turkey objects outright because they have a different interface
 */
class TurkeyAdapter implements Duck {
  private Turkey turkey;
  TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  @Override
  public void quack() {
    turkey.gobble();
  }

  @Override
  public void fly() {
    turkey.fly();
  }

}
