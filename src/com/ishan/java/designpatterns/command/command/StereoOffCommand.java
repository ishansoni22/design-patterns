package com.ishan.java.designpatterns.command.command;

import com.ishan.java.designpatterns.command.receiver.Stereo;

public class StereoOffCommand implements Command {
  private Stereo stereo;
  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.off();
  }

  @Override
  public void undo() {
    stereo.on();
    stereo.setCD();
    stereo.changeVolume(15);
  }

}
