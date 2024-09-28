package com.example.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.example.loader.UnitsLoader;
import com.example.model.ConversionFactorUnit;
import com.example.model.Unit;
import com.example.model.UnitType;

public class ConversionService {

  private final TemperatureConversionService temperatureConversionService;

  public ConversionService() {
    this.temperatureConversionService = new TemperatureConversionService();
  }

  public double convert(String from, String to, double value) {
    Unit f = UnitsLoader.UNITS.get(from);
    Unit t = UnitsLoader.UNITS.get(to);

    if (!f.getType().equals(UnitType.TEMPERATURE)) {
      return convertConversionFactorUnit((ConversionFactorUnit) f, (ConversionFactorUnit) t, value);
    }

    return temperatureConversionService.convert(f, t, value);
  }

  public Map<String, List<Unit>> groupByType() {
    return UnitsLoader.UNITS.values().stream()
        .collect(Collectors.groupingBy(u -> u.getType().toString()));
  }

  private double convertConversionFactorUnit(ConversionFactorUnit f, ConversionFactorUnit t,
      double value) {
    return (value * f.getConversionFactor()) / t.getConversionFactor();
  }
}
