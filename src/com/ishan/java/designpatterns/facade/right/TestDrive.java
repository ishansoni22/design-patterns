package com.ishan.java.designpatterns.facade.right;

public class TestDrive {

  public static void main(String[] args) throws InterruptedException {
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    Projector projector = new Projector();
    Amplifier amplifier = new Amplifier();
    DvDPlayer dvDPlayer = new DvDPlayer();

    HomeTheaterFacade facade = new HomeTheaterFacade(
        lights, screen, projector, amplifier, dvDPlayer
    );

    facade.watchMovie(10, 5, "Forest Gump");

    Thread.sleep(2000);

    facade.endMovie();
  }

}
