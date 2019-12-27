package com.ishan.java.designpatterns.command.receiver;

public class Stereo {
  public void on() {
    System.out.println("Switching on the Stereo");
  }

  public void off() {
    System.out.println("Switching off the Stereo");
  }

  public void setCD() {
    System.out.println("Setting CD");
  }

  public void changeVolume(int volume) {
    System.out.printf("Changing volume to %s", volume);
    System.out.println();
  }

}
