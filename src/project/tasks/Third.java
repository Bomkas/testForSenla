package project.tasks;

import static project.tools.Config.IS_EMPTY;
import static project.tools.Config.IS_NOT_PALINDROME;
import static project.tools.Config.IS_PALINDROME;
import static project.tools.Tools.writeLine;

public class Third {
  public static String getAnswer() {
    String line = writeLine();

    if (line == null || line.replaceAll("\\W", "").equals(""))
      return "Line " + IS_EMPTY;

    if (line.replaceAll("\\W", "")
      .equalsIgnoreCase(new StringBuilder(line.replaceAll("\\W", ""))
        .reverse().toString()))
      return IS_PALINDROME;
    else
      return IS_NOT_PALINDROME;
  }
}
