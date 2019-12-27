package com.ishan.java.designpatterns.command.command;

// Null Object Pattern
// When you don't have a meaningful object to return and yet you want to remove the
// responsibility of handling null checks from your client code
public class NoCommand implements Command {
  @Override
  public void execute() {
    // Does nothing
  }

  @Override
  public void undo() {

  }

}
