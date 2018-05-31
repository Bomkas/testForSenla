package project.tasks;

import org.jetbrains.annotations.NotNull;

import static project.tools.RandomGenerator.getRandomInteger;
import static project.tools.Tools.writeNumber;

public class Seventh {
  @NotNull
  public static String getAnswer() {
    Integer arrayLength = writeNumber();
    StringBuilder out = new StringBuilder("Numbers array:");
    Integer[] numbersArray = new Integer[arrayLength];

    for (Integer i = 0; i < arrayLength; i++) {
      Integer value = getRandomInteger(10, 99);
      numbersArray[i] = value;
      out.append(" ").append(value);
    }

    Integer maxNumber = numbersArray[0];
    Integer minNumber = numbersArray[0];

    for (Integer i = 0; i < arrayLength; i++) {
      if (numbersArray[i] > maxNumber) {
        maxNumber = numbersArray[i];
        continue;
      }

      if (numbersArray[i] < minNumber)
        minNumber = numbersArray[i];
    }

    out.append("\nMax Number: ").append(maxNumber);
    out.append("\nMin Number: ").append(minNumber);

    return out.toString();
  }
}
