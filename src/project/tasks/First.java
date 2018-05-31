package project.tasks;

import org.jetbrains.annotations.NotNull;
import project.tools.Tools;

import static project.tools.Config.*;

public class First {

  @NotNull
  public static String getAnswer() {

    Integer number = Tools.writeNumber();
    StringBuilder out = new StringBuilder();
    boolean isPrime = true;

    if (number <= 1)
      out.append(NOT_NATURAL + " or equal to one");

    for (Integer i = 2; i < Math.round(number / 2.0); i++) {
      if (number % i == 0) {
        out.append(IS_COMPOUND);
        isPrime = false;
        break;
      }
    }

    if (isPrime && number > 1 || number < 4 && number > 1)
      out.append(IS_PRIME);

    if (number % 2 == 0)
      out.append(IS_EVEN);
    else out.append(IS_ODD);

    return out.toString();
  }

}
