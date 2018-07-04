package ru.job4j.tracker;

import java.util.Scanner;

class ConsoleInput implements Input {

  private Scanner scan = new Scanner(System.in);

  public String ask(String question) {
    System.out.println(question);
    return scan.nextLine();
  }
  public int ask(String question, int[] range) {
    int key = Integer.valueOf(this.ask(question));
    boolean exist = false;
    for (int value : range) {
      if (key == value) {
        exist = true;
        break;
      }
    }
    if (exist) {
      return key;
    } else {
      throw new MenuOutExeption("выберите пункт меню");
    }
  }
}