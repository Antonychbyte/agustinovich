package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
  @Override
  public int ask(String question, int[] range) {
    boolean invalid = true;
    int userInput = -1;
    MenuTracker menu = new MenuTracker();
    do {
      try {
        userInput = super.ask(question, range);
        invalid = false;
      } catch (NumberFormatException nfe) {
        System.out.println("при вводе пункта меню используйте только цифры");
      } catch (MenuOutExeption menuOutExeption) {
        System.out.println("выберите пункт меню");
      }
      menu.fillActions();
      menu.showMenu();
    } while (invalid);
    return userInput;
  }
}