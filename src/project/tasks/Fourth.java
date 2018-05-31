package project.tasks;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

import static project.tools.Config.IS_EMPTY;
import static project.tools.Tools.writeLine;

public class Fourth {
  @NotNull
  public static String getAnswer() {
    String line = writeLine();
    String[] arrayLine;

    if (line == null || line.split("\\W+").length == 0) {
      return "Line " + IS_EMPTY;
    } else
      arrayLine = line.split("\\W+");

    StringBuilder out = new StringBuilder("Number of words in the sentence: " + arrayLine.length + "\n");

    ArrayList<String> allWords = new ArrayList<>();
    Collections.addAll(allWords, arrayLine);
    Collections.sort(allWords);

    out.append("Sorted words:\n");

    for (String word : allWords)
      out.append(word).append("\n");

    return out.toString();
  }
}
