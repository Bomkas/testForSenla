package project.tasks;

import static project.tools.Tools.writeNumber;

public class Tenth {
  public static String getAnswer() {
    StringBuilder out = new StringBuilder();
    Integer[] numbersArray = {
      getNumber("Write first number"),
      getNumber("Write second number"),
      getNumber("Write third number")};

    for (int i = 0; i < numbersArray.length; i++) {
      for (int j = 0; j < numbersArray.length - 1; j++) {
        Integer line = Integer.parseInt(getLine(numbersArray));
        /**
         * Задача была поставлена не явно. Сказано выводить возможные комбинации "трехзначных" чисел.
         * Так как 023 двузначное число, оно не может удовлетворять условию, но если все же может, то достаточно просто
         * удалить проверку ниже.
         * P.S. Нули стоящие в начале не будут отображены, так как Integer.parseInt возвращает без нуля на первой позиции
         * **/
        if (line >= 100)
          out.append(line).append("\n");

        Integer temp = numbersArray[j];
        numbersArray[j] = numbersArray[j + 1];
        numbersArray[j + 1] = temp;
      }
    }

    return out.toString();
  }

  private static String getLine(Integer[] arr) {
    StringBuilder builder = new StringBuilder();
    for (Integer s : arr)
      builder.append(s);

    return builder.toString();
  }

  private static Integer getNumber(String title) {
    Integer number = -1;

    while (number < 0 || number > 9)
      number = writeNumber(title);

    return number;
  }
}
