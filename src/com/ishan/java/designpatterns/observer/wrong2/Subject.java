package com.ishan.java.designpatterns.observer.wrong2;

public interface Subject {

  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

}
