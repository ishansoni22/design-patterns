package com.ishan.java.designpatterns.adapter.example1;

import java.util.ArrayList;
import java.util.List;

// The Client. The Client sees/uses/expects only the Target interface(Here the Duck Interface)
public class DuckTestDrive {

  public static void main(String[] args) {
    List<Duck> ducks = new ArrayList<>();

    Duck mallardDuck = new MallardDuck();
    Turkey wildTurkey = new WildTurkey();
    TurkeyAdapter adapter = new TurkeyAdapter(wildTurkey);
    ducks.add(mallardDuck);
    ducks.add(adapter);

    ducks.forEach(duck -> {
      duck.quack();
      duck.fly();
    });
  }

}
