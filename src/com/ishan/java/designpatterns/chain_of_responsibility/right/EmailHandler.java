package com.ishan.java.designpatterns.chain_of_responsibility.right;

public interface EmailHandler {
  void handle(EmailRequest request);
  void next(EmailHandler next);

}
