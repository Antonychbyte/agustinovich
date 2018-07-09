package ru.job4j.tracker;

public class ValidateInput implements Input {

  private final Input input;

  public ValidateInput(final Input input) {
    this.input = input;
  }
  @Override
  public String ask(String question) {
    return this.input.ask(question);
  }
  @Override
  public int ask(String question, int[] range) {
    boolean invalid = true;
    int userInput = -1;
    MenuTracker menu = new MenuTracker();
    do {
      try {
        userInput = this.input.ask(question, range);
        invalid = false;
      } catch (NumberFormatException nfe) {
        System.out.println("при вводе пункта меню используйте только цифры");
        menu.fillActions();
        menu.showMenu();
      } catch (MenuOutExeption menuOutExeption) {
        System.out.println("выберите пункт меню");
        menu.fillActions();
        menu.showMenu();
      }

    } while (invalid);
    return userInput;
  }
}