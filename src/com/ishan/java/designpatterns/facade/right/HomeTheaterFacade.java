package com.ishan.java.designpatterns.facade.right;

public class HomeTheaterFacade {
  TheaterLights lights;
  Screen screen;
  Projector projector;
  Amplifier amplifier;
  DvDPlayer dvDPlayer;

  public HomeTheaterFacade(
      TheaterLights lights,
      Screen screen,
      Projector projector,
      Amplifier amplifier,
      DvDPlayer dvDPlayer) {
    this.lights = lights;
    this.screen = screen;
    this.projector = projector;
    this.amplifier = amplifier;
    this.dvDPlayer = dvDPlayer;
  }

  public void watchMovie(int lightLevel, int amplifierVol, String movie) {
    lights.on();
    lights.dim(lightLevel);

    screen.down();

    projector.on();
    projector.setInput(dvDPlayer);
    projector.wideScreenMode();

    amplifier.on();
    amplifier.setInput(dvDPlayer);
    amplifier.setVolume(amplifierVol);

    dvDPlayer.on();
    dvDPlayer.play(movie);
  }

  public void endMovie() {
    lights.off();
    screen.up();
    projector.off();
    amplifier.off();
    dvDPlayer.stop();
    dvDPlayer.eject();
    dvDPlayer.off();
  }

}
