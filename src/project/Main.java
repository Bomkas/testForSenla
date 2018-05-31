package project;

import project.tasks.*;

class Main {

  /**
   * Enter the number of the task you want to run in the argument line
   */

  public static void main(String[] args) {
    String out;

    switch (Integer.parseInt(args[0])) {
      case 1:
        out = First.getAnswer();
        break;
      case 2:
        out = Second.getAnswer();
        break;
      case 3:
        out = Third.getAnswer();
        break;
      case 4:
        out = Fourth.getAnswer();
        break;
      case 5:
        out = Fifth.getAnswer();
        break;
      case 6:
        out = Sixth.getAnswer();
        break;
      case 7:
        out = Seventh.getAnswer();
        break;
      case 8:
        out = Eighth.getAnswer();
        break;
      case 9:
        out = Ninth.getAnswer();
        break;
      case 10:
        out = Tenth.getAnswer();
        break;
      default:
        out = "Please enter valid number in argument line";
        break;
    }

    System.out.println(out);
  }
}
