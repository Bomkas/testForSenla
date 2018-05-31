package project.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static project.tools.Tools.writeLine;

public class Fifth {
  @NotNull
  public static String getAnswer() {
    String line = writeLine();
    String subLine = "\\b" + Objects.requireNonNull(writeLine("Write subLine")).toLowerCase() + "\\b";
    Pattern pattern = Pattern.compile(subLine);
    Matcher matcher = pattern.matcher(Objects.requireNonNull(line).toLowerCase());

    int occurrencesCount = 0;

    while (matcher.find())
      occurrencesCount++;

    return "Found " + occurrencesCount + " occurrences";
  }
}
