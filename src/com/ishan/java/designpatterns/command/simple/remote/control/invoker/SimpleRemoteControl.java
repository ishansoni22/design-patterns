package com.ishan.java.designpatterns.command.simple.remote.control.invoker;

import com.ishan.java.designpatterns.command.command.Command;

// This is our invoker.
// It will have a setCommand method that the client will use and set the command into.
// This class(invoker) can then invoke the command at any time
public class SimpleRemoteControl {

  Command slot;
  public void setCommand(Command command) {
    this.slot = command;
  }

  public void pressButton() {
    slot.execute();
  }

}
