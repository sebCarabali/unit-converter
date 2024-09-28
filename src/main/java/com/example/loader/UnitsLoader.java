package com.example.loader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import com.example.model.ConversionFactorUnit;
import com.example.model.Unit;
import com.example.model.UnitType;

public final class UnitsLoader {

  public static final Map<String, Unit> UNITS = loadUnits();

  private UnitsLoader() {}

  private static Map<String, Unit> loadUnits() {
    Map<String, Unit> units = new HashMap<>();
    try {
      Path path = Paths.get("C:\\Users\\sebca\\eclipse-workspace\\unit-converter-dwp\\src\\main\\java\\com\\example\\loader\\unidades.txt");
      Files.readAllLines(path).forEach(line -> {
        Unit unit = readLine(line);
        units.put(unit.getSymbol(), unit);
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
    return units;
  }

  private static Unit readLine(String line) {
    String[] splittedLine = line.split(",");
    if (splittedLine.length == 3) {
      return new Unit(splittedLine[0], splittedLine[1],
          UnitType.valueOf(splittedLine[2].toUpperCase()));
    }
    return new ConversionFactorUnit(splittedLine[0], splittedLine[1],
        UnitType.valueOf(splittedLine[3].toUpperCase()), Double.valueOf(splittedLine[2]));
  }

}
