package project.tasks;

import org.jetbrains.annotations.Contract;
import project.tools.Tools;

import static project.tools.Config.IS_NULL;

public class Second {
  public static String getAnswer() {

    Integer firstNumber = Tools.writeNumber();
    Integer secondNumber = Tools.writeNumber();

    StringBuilder out = new StringBuilder("sum = " + (firstNumber + secondNumber) + "\n");
    out.append("diff = ").append(Math.abs(firstNumber - secondNumber)).append("\n");
    out.append("gcd = ").append(gcd(Math.abs(firstNumber), Math.abs(secondNumber))).append("\n");
    if (firstNumber == 0 || secondNumber == 0)
      out.append("Can not count gcm because: " + IS_NULL);
    else
      out.append("gcm = ").append(gcm(Math.abs(firstNumber), Math.abs(secondNumber))).append("\n");

    return out.toString();
  }

  private static Integer gcd(Integer firstNumber, Integer secondNumber) {
    if (secondNumber == 0)
      return firstNumber;
    return gcd(secondNumber, firstNumber % secondNumber);
  }

  @Contract(pure = true)
  private static Integer gcm(Integer firstNumber, Integer secondNumber) {
    Integer gcm;
    if (firstNumber < secondNumber)
      gcm = secondNumber;
    else gcm = firstNumber;

    while (true) {
      if (gcm % firstNumber == 0 && gcm % secondNumber == 0)
        break;
      else gcm++;
    }

    return gcm;
  }
}
