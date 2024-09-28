package com.example.model;

public class ConversionFactorUnit extends Unit {

  /**
   * 
   */
  private static final long serialVersionUID = -6462149298617689908L;

  private double conversionFactor;

  public ConversionFactorUnit() {
    super();
  }

  public ConversionFactorUnit(String name, String symbol, UnitType type, double conversionFactor) {
    super(name, symbol, type);
    this.conversionFactor = conversionFactor;
  }

  public double getConversionFactor() {
    return conversionFactor;
  }

  public void setConversionFactor(double conversionFactor) {
    this.conversionFactor = conversionFactor;
  }

  @Override
  public String toString() {
    return "ConversionFactorUnit [getConversionFactor()=" + getConversionFactor() + ", Name="
        + getName() + ", Symbol=" + getSymbol() + "]";
  }



}
