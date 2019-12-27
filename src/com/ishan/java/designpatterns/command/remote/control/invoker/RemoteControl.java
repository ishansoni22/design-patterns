package com.ishan.java.designpatterns.command.remote.control.invoker;

import com.ishan.java.designpatterns.command.command.Command;
import com.ishan.java.designpatterns.command.command.NoCommand;
import java.util.Arrays;
import java.util.Stack;

public class RemoteControl {

  int slots;
  Command[] on;
  Command[] off;
  Stack<Command> history;

  public RemoteControl(int slots) {
    this.slots = Math.abs(slots);
    this.on = new Command[slots];
    this.off = new Command[slots];

    for(int i = 0; i < slots; i++) {
      this.on[i] = new NoCommand();
      this.off[i] = new NoCommand();
    }
    history = new Stack<>();
  }

  public void setCommand(int slot, Command onCommand,
      Command offCommand) {
    checkIfValidSlot(slot);
    this.on[slot] = onCommand;
    this.off[slot] = offCommand;
  }

  public void pressOnButton(int slot) {
    checkIfValidSlot(slot);
    this.on[slot].execute();
    pushToHistory(this.on[slot]);
  }

  public void pressOffButton(int slot) {
    checkIfValidSlot(slot);
    this.off[slot].execute();
    pushToHistory(this.off[slot]);
  }

  private void checkIfValidSlot(int slot) {
    if(! (0 <= slot && slot < this.slots) ) {
      throw new IllegalStateException("Invalid slot!");
    }
  }

  private void pushToHistory(Command command) {
    history.push(command);
  }

  public void undo() {
    if(! history.empty()) {
      Command lastCommand = history.pop();
      lastCommand.undo();
    }
  }

  @Override
  public String toString() {
    return "RemoteControl {" +
        "\n on=" + Arrays.asList(on) +
        "\n off=" + Arrays.toString(off) +
        "\n slots=" + slots +
        "\n}";
  }

}
