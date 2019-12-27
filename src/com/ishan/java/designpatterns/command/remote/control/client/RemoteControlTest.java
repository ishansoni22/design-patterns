package com.ishan.java.designpatterns.command.remote.control.client;

import com.ishan.java.designpatterns.command.command.LightOffCommand;
import com.ishan.java.designpatterns.command.command.LightOnCommand;
import com.ishan.java.designpatterns.command.command.StereoOffCommand;
import com.ishan.java.designpatterns.command.command.StereoOnCommand;
import com.ishan.java.designpatterns.command.receiver.Light;
import com.ishan.java.designpatterns.command.receiver.Stereo;
import com.ishan.java.designpatterns.command.remote.control.invoker.RemoteControl;

public class RemoteControlTest {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl(3);
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);

    Stereo stereo = new Stereo();
    StereoOnCommand stereoOnCommand =  new StereoOnCommand(stereo);
    StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

    remoteControl.setCommand(1, lightOnCommand, lightOffCommand);
    remoteControl.setCommand(2, stereoOnCommand, stereoOffCommand);

    //Check state of the remote control
    System.out.println(remoteControl);

    remoteControl.pressOnButton(1);
    remoteControl.pressOnButton(2);

    remoteControl.undo();
    remoteControl.undo();

  }

}
