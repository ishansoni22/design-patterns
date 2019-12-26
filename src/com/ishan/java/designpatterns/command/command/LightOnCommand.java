package com.ishan.java.designpatterns.command.command;

import com.ishan.java.designpatterns.command.receiver.Light;

public class LightOnCommand implements Command {
  private Light light;
  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }

}
