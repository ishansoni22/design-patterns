package com.ishan.java.designpatterns.builder.right;

public class Lunch {
  private String bread;
  private String condiments;
  private String dressing;
  private String meat;
  private String drink;
  private String dessert;

  private Lunch(String bread, String condiments, String dressing, String meat,
      String drink, String dessert) {
    this.bread = bread;
    this.condiments = condiments;
    this.dressing = dressing;
    this.meat = meat;
    this.drink = drink;
    this.dessert = dessert;
  }

  // -- or --
  private Lunch(Builder builder) {

  }

  public static class Builder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
    private String drink;
    private String dessert;

    public Builder(String bread) {
      this.bread = bread;
    }

    public Builder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    public Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public Builder drink(String drink) {
      this.drink = drink;
      return this;
    }

    public Builder dessert(String dessert) {
      this.dessert = dessert;
      return this;
    }

    public Lunch build() {
      return new Lunch(this.bread, this.condiments, this.dressing,
          this.meat, this.drink, this.dessert);
    }

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

  @Override
  public String toString() {
    return "Lunch{" +
        "bread='" + bread + '\'' +
        ", condiments='" + condiments + '\'' +
        ", dressing='" + dressing + '\'' +
        ", meat='" + meat + '\'' +
        ", drink='" + drink + '\'' +
        ", dessert='" + dessert + '\'' +
        '}';
  }

}
