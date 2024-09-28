package com.example.model;

import java.io.Serializable;

public class Unit implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 790973973121962560L;

  public Unit() {}

  public Unit(String name, String symbol, UnitType type) {
    this.name = name;
    this.symbol = symbol;
    this.type = type;
  }


  private String name;
  private String symbol;
  private UnitType type;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public UnitType getType() {
    return type;
  }

  public void setType(UnitType type) {
    this.type = type;
  }
}
