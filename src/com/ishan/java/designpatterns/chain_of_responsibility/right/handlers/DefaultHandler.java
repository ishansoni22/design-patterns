package com.ishan.java.designpatterns.chain_of_responsibility.right.handlers;

import com.ishan.java.designpatterns.chain_of_responsibility.right.EmailHandler;
import com.ishan.java.designpatterns.chain_of_responsibility.right.EmailRequest;

public class DefaultHandler implements EmailHandler {

  @Override
  public void handle(EmailRequest request) {
    System.out.println(this.getClass().getName() + " | Processing request");
  }

  @Override
  public void next(EmailHandler next) {
    throw new IllegalStateException("Does not support next handler");
  }
}
