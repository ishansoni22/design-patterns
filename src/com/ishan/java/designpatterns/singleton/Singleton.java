package com.ishan.java.designpatterns.singleton;

import java.util.Objects;

public class Singleton {

  private static Singleton instance;

  private Singleton() {

  }

  /** What if two threads invoke the getInstance() method at the same time
   *  Hint:
   *    What would happen if the Singleton instance has not been created yet
   *    and 2 threads call the getInstance() method? - It may happen that
   *    both of them get 2 different instances!
   */
  public static Singleton getInstance() {
    if(Objects.isNull(instance)) {
      instance = new Singleton();
    }
    return instance;
  }

  //----------Option 1 (Trivial) : Use the synchronised keyword

  /**
   * By adding the synchronised keyword, we force every thread to wait
   * its turn before it can enter the method. That is to so that,
   * no 2 threads can enter this method at the same time
   *
   * Pitfalls :
   * Synchronisation is expensive. It can reduce performance by a factor of 100!
   *
   * Can you improve it?
   *
   *  1. Do nothing of the performance of this code is not critical to your application
   *  2. Switch to early(eager) initialization if your application will always
   *     create an instance of the Singleton
   *  3. Use "double-checked locking to reduce the use of synchronisation in getInstance()"
   *     [//Todo Please study how to use this approach!]
   */
  public static synchronized Singleton getSynchronisedInstance() {
    return null;

  }

}
