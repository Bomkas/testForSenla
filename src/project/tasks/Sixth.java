package project.tasks;

import org.jetbrains.annotations.NotNull;

import static project.tools.Config.ERROR;
import static project.tools.Tools.writeDouble;

public class Sixth {
  @NotNull
  public static String getAnswer() {
    Double firstLineSegment = writeDouble("Write first line segment");
    Double secondLineSegment = writeDouble("Write second line segment");
    Double thirdLineSegment = writeDouble("Write third line segment");

    if (firstLineSegment <= 0 || secondLineSegment <= 0 || thirdLineSegment <= 0)
    {
      System.out.println(ERROR + "One or more number is less than or equal to zero");
      System.exit(1);
    }

    firstLineSegment = Math.pow(firstLineSegment, 2);
    secondLineSegment = Math.pow(secondLineSegment, 2);
    thirdLineSegment = Math.pow(thirdLineSegment, 2);

    if (firstLineSegment == secondLineSegment + thirdLineSegment ||
      secondLineSegment == firstLineSegment + thirdLineSegment ||
      thirdLineSegment == firstLineSegment + secondLineSegment)
      return "Triangle is rectangular";
    else
      return "Triangle is not rectangular";

  }
}
