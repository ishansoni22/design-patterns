package com.ishan.java.designpatterns.builder.wrong2;

/**
 *
 * Telescoping : What we are saying is that bread is the minimum requirement for a Lunch!
 *
 * Problems:
 * 1. What if I want Lunch with just Bread and Meat?
 *  - Pass in null for others or create another constructor! (Since we are not providing setters)
 *    - Good thing is this object would be immutable
 *  - Or provide setters? Why? :( - The java bean anti pattern in /wrong1 is much better/flexible that this in that case
 *
 */
public class Lunch {
  private String bread;
  private String condiments;
  private String dressing;
  private String meat;
  private String drink;
  private String dessert;


  public Lunch(String bread) {
    this.bread = bread;
  }

  public Lunch(String bread, String condiments) {
    this(bread);
    this.condiments = condiments;
  }

  public Lunch(String bread, String condiments, String dressing){
    this(bread, condiments);
    this.dressing = dressing;
  }

  public Lunch(String bread, String condiments, String dressing, String meat){
    this(bread, condiments, dressing);
    this.meat = meat;
  }

  public Lunch(String bread, String condiments, String dressing, String meat, String drink){
    this(bread, condiments, dressing, meat);
    this.drink = drink;
  }

  public Lunch(String bread, String condiments, String dressing, String meat, String drink, String dessert){
    this(bread, condiments, dressing, meat, drink);
    this.dessert = dessert;
  }

  public String getBread() {
    return bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public String getDressing() {
    return dressing;
  }

  public String getMeat() {
    return meat;
  }

  public String getDrink() {
    return drink;
  }

  public String getDessert() {
    return dessert;
  }

}
