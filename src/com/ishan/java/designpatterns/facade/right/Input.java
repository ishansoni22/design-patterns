package com.ishan.java.designpatterns.facade.right;

public interface Input {

  void on();

  void off();

  void eject();

  void play(String movie);

  void pause();

  void stop();
}
