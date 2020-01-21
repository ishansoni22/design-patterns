package com.ishan.java.designpatterns.facade.wrong;

public class TestDrive {

  // Client
  // To watch a movie, you need to perform the following tasks :
  // We can already see how complicated it can get
  // When the Movie is over, how do you turn everything off? - You will have to do this in reverse
  public static void main(String[] args) {
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    Projector projector = new Projector();
    Amplifier amplifier = new Amplifier();
    DvDPlayer dvDPlayer = new DvDPlayer();

    lights.on();
    lights.dim(10);

    screen.down();

    projector.on();
    projector.setInput(dvDPlayer);
    projector.wideScreenMode();

    amplifier.on();
    amplifier.setInput(dvDPlayer);
    amplifier.setVolume(5);

    dvDPlayer.on();
    dvDPlayer.play("Forest Gump");
  }

}
