package com.ishan.java.designpatterns.command.command;

import com.ishan.java.designpatterns.command.receiver.Stereo;

public class StereoOnCommand implements Command {
  private Stereo stereo;
  public StereoOnCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.on();
    stereo.setCD();
    stereo.changeVolume(15);
  }

  @Override
  public void undo() {
    stereo.off();
  }

}
