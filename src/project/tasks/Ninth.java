package project.tasks;

import static project.tools.Tools.writeNumber;

public class Ninth {
  public static String getAnswer() {
    Integer maxNumber = -1;
    while (maxNumber < 0)
      maxNumber = writeNumber();
    StringBuilder out = new StringBuilder("Even numbers:");
    Integer sum = 0;

    if (maxNumber >= 2)
    for (Integer i = 0; i <= maxNumber; i++) {
      if (isEven(i)) {
        out.append(" ").append(i);
        sum += i;
      }
    } else
      out.append("There are no even numbers except for zero");

    out.append("\n").append("The sum of even numbers on a given interval is ").append(sum);

    return out.toString();
  }

  private static Boolean isEven(Integer number) {
    return number % 2 == 0;
  }
}
