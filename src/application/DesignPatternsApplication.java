package application;

import com.ishan.java.designpatterns.strategic.right.CannotFlyBehaviour;
import com.ishan.java.designpatterns.strategic.right.FlyBehaviour;
import com.ishan.java.designpatterns.strategic.right.MallardDuck;
import com.ishan.java.designpatterns.strategic.right.NormalFlyBehaviour;
import com.ishan.java.designpatterns.strategic.wrong1.Duck;
import com.ishan.java.designpatterns.strategic.wrong1.RubberDuck;

public class DesignPatternsApplication {

  public static void main(String[] args) {

    /**
     * Strategic Design Pattern
     */

    Duck wrongDuck1 = new RubberDuck();
    wrongDuck1.fly();

    com.ishan.java.designpatterns.strategic.wrong2.Duck wrongDuck2 = new com.ishan.java.designpatterns.strategic.wrong2.RubberDuck();
    // Can only Swim -> wrongDuck2.

    FlyBehaviour normalFlyBehaviour = new NormalFlyBehaviour();
    com.ishan.java.designpatterns.strategic.right.Duck rightDuck1 = new MallardDuck(normalFlyBehaviour);
    rightDuck1.display();
    rightDuck1.swim();
    rightDuck1.fly();

    FlyBehaviour cannotFlyBehaviour = new CannotFlyBehaviour();
    com.ishan.java.designpatterns.strategic.right.Duck rightDuck2 = new com.ishan.java.designpatterns.strategic.right.RubberDuck(cannotFlyBehaviour);
    rightDuck2.display();
    rightDuck2.swim();
    rightDuck2.fly();

  }

}
