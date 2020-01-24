package com.ishan.java.designpatterns.chain_of_responsibility.right;

import com.ishan.java.designpatterns.chain_of_responsibility.right.handlers.DefaultHandler;
import com.ishan.java.designpatterns.chain_of_responsibility.right.handlers.PromotionsHandler;
import com.ishan.java.designpatterns.chain_of_responsibility.right.handlers.SocialHandler;
import com.ishan.java.designpatterns.chain_of_responsibility.right.handlers.SpamHandler;

public class Client {

  public static void main(String[] args) {
    EmailHandler spam = new SpamHandler();
    EmailHandler promotions = new PromotionsHandler();
    EmailHandler social = new SocialHandler();
    EmailHandler defaultHandler = new DefaultHandler();

    spam.next(promotions);
    promotions.next(social);
    social.next(defaultHandler);

    // Mock and test Request

    EmailRequest email = new EmailRequest("x@x.com", "y@y.com", "Hi!");
    spam.handle(email);

  }

}
