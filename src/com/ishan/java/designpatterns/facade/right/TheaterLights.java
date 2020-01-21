package com.ishan.java.designpatterns.facade.right;

class TheaterLights {

  void on() {
    System.out.println("Switching on the Theater Lights");
  }

  void off() {
    System.out.println("Switching off the Theater Lights");
  }

  void dim(int level) {
    System.out.println("Dimming the Theater Lights to : " + level);
  }

}
