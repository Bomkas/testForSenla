package project.tools;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static project.tools.Config.ERROR;

public class Tools {

  @NotNull
  public static Integer writeNumber() {
    System.out.println("Write an integer");
    return getInteger();
  }

  @NotNull
  public static Integer writeNumber(String title) {
    System.out.println(title);
    return getInteger();
  }

  private static Integer getInteger() {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    try {
      return Integer.parseInt(bufferedReader.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      System.out.println(ERROR + "Please, write an integer");
      System.exit(1);
    }
    return 0;
  }

  @NotNull
  public static Double writeDouble(String title) {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    System.out.println(title);
    try {
      return Double.parseDouble(bufferedReader.readLine());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      System.out.println(ERROR + "Please, write an double");
      System.exit(1);
    }

    return 0.0;
  }

  @Nullable
  public static String writeLine(String title) {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    System.out.println(title);
    try {
      return bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  @Nullable
  public static String writeLine() {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    System.out.println("Write Line");
    try {
      return bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }
}
