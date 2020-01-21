package com.ishan.java.designpatterns.facade.right;

class DvDPlayer implements Input {
  Amplifier amplifier;

  @Override
  public void on() { System.out.println("Switching the DvDPlayer on"); }

  @Override
  public void off() {
    System.out.println("Switching the DvDPlayer off");
  }

  @Override
  public void eject() {
    System.out.println("Ejecting the DvDPlayer on");
  }

  @Override
  public void play(String movie) {
    System.out.println("Playing the DvDPlayer. Playing : " + movie);
  }

  @Override
  public void pause() {
    System.out.println("Pausing the DvDPlayer");
  }

  @Override
  public void stop() {
    System.out.println("Stopping the DvDPlayer");
  }

}
