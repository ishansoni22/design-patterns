package com.ishan.java.designpatterns.command.simple.remote.control.client;

import com.ishan.java.designpatterns.command.command.LightOnCommand;
import com.ishan.java.designpatterns.command.receiver.Light;
import com.ishan.java.designpatterns.command.simple.remote.control.invoker.SimpleRemoteControl;

// This class is our client
// It will prepare the command object and invoke the setCommand on the invoker
public class SimpleRemoteControlTest {
  public static void main(String[] args) {
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);

    SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
    simpleRemoteControl.setCommand(lightOnCommand);

    simpleRemoteControl.pressButton();

  }

}
