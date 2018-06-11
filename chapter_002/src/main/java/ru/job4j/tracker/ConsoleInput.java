package ru.job4j.tracker;

import java.util.Scanner;

class ConsoleInput implements Input {
      private Scanner scan = new Scanner(System.in);
      public String ask(String questsion) {
             System.out.println(questsion);
             return scan.nextLine();
      }
}