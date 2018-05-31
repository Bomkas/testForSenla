package project.tasks;

import org.jetbrains.annotations.NotNull;

import static project.tools.Tools.writeNumber;

public class Eighth {
  @NotNull
  public static String getAnswer() {
    Integer maxNumber = -1;
    StringBuilder out = new StringBuilder("At a given interval, the numbers palindromes are:");

    while (maxNumber > 100 || maxNumber < 0)
      maxNumber = writeNumber();


    for (Integer i = 0; i <= maxNumber; i++)
    if (i.toString().contentEquals(new StringBuilder(i.toString()).reverse()))
      out.append(" ").append(i);

    return out.toString();
  }
}
