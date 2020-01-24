package com.ishan.java.designpatterns.chain_of_responsibility.right.handlers;

import com.ishan.java.designpatterns.chain_of_responsibility.right.EmailHandler;
import com.ishan.java.designpatterns.chain_of_responsibility.right.EmailRequest;

public class SocialHandler implements EmailHandler {
  private EmailHandler next;
  @Override
  public void handle(EmailRequest request) {
    // Check if this handler can handle the request
    if(false) {

    } else {
      System.out.println(this.getClass().getName() +
          " | Cannot handle request. Passing on to next handler");
      next.handle(request);
    }
  }

  @Override
  public void next(EmailHandler next) {
    this.next = next;
  }
}
