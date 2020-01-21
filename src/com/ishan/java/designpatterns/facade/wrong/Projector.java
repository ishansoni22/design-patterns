package com.ishan.java.designpatterns.facade.wrong;

class Projector {
  Input player;

  void on() {
    System.out.println("Switching the projector on");
  }

  void setInput(Input input) {
    this.player = player;
  }

  void off() {
    System.out.println("Switching the projector off");
  }

  void wideScreenMode() {
    System.out.println("Projector - entering wide screen mode");
  }

}
