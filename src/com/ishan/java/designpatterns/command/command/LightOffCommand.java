package com.ishan.java.designpatterns.command.command;

import com.ishan.java.designpatterns.command.receiver.Light;

public class LightOffCommand implements Command {
  private Light light;
  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() { light.on(); }

}
