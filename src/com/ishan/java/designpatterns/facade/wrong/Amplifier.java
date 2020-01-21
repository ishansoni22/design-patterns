package com.ishan.java.designpatterns.facade.wrong;

class Amplifier {
  Input input;
  void on() {
    System.out.println("Switching the Amplifier on");
  }

  void off() {
    System.out.println("Switching the Amplifier off");
  }

  void setInput(Input input) {
    this.input = input;
  }

  void setVolume(int volume) {
    System.out.println("Amplifier - setting the volume to : " + volume);
  }

}
