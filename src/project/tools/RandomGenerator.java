package project.tools;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class RandomGenerator {
  @NotNull
  public static Integer getRandomInteger(Integer minValue, Integer maxValue) {
    Random random = new Random();
    return minValue + random.nextInt(maxValue - minValue + 1);
  }
}
