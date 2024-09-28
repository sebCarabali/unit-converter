package com.example.service;

import com.example.model.Unit;

public class TemperatureConversionService {

  public double convert(Unit f, Unit t, double value) {
    if (f.getName().equals("Celsius") && t.getName().equals("Fahrenheit")) {
      return (value * 9 / 5) + 32;
    } else if (f.getName().equals("Celsius") && t.getName().equals("Kelvin")) {
      return value + 273.15;
    } else if (f.getName().equals("Fahrenheit") && t.getName().equals("Celsius")) {
      return (value - 32) * 5 / 9;
    } else if (f.getName().equals("Fahrenheit") && t.getName().equals("Kelvin")) {
      return (value - 32) * 5 / 9 + 273.15;
    } else if (f.getName().equals("Kelvin") && t.getName().equals("Celsius")) {
      return value - 273.15;
    } else if (f.getName().equals("Kelvin") && t.getName().equals("Fahrenheit")) {
      return (value - 273.15) * 9 / 5 + 32;
    }
    return 0.0;
  }
}
