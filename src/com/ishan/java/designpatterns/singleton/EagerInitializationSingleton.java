package com.ishan.java.designpatterns.singleton;

public class EagerInitializationSingleton {

  private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

  private EagerInitializationSingleton() {

  }

  /**
   * You rely on the JVM to create this instance when the class is laoded!
   *
   */
  public static EagerInitializationSingleton getInstance() {
    return instance;
  }

}
