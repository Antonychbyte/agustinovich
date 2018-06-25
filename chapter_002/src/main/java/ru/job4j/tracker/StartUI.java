package ru.job4j.tracker;

public class StartUI {

  private final Input input;
  private final Tracker tracker;

  public StartUI(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
  }
  public void init() {
    MenuTracker menu = new MenuTracker(this.input, this.tracker);
    menu.fillActions();
    int key;
    do {
      menu.showMenu();
      key = Integer.valueOf(input.ask("Select:"));
      menu.select(key);
    } while (key != 7);
  }
  public static void main(String[] args) {
    new StartUI(new ConsoleInput(), new Tracker()).init();
  }
}
