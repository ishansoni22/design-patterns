package com.ishan.java.designpatterns.chain_of_responsibility.right;

import java.util.Objects;

public class EmailRequest {
  private String to;
  private String from;
  private String content;

  public EmailRequest(String to, String from, String content) {
    this.to = Objects.requireNonNull(to);
    this.from = Objects.requireNonNull(from);
    this.content = Objects.requireNonNull(content);
  }

  public String getTo() {
    return to;
  }

  public String getFrom() {
    return from;
  }

  public String getContent() {
    return content;
  }
}
