package ru.job4j.tracker;

public class StartUI {
  private int[] range;
  private final Input input;
  private final Tracker tracker;

  public StartUI(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
  }

  public void init() {
    MenuTracker menu = new MenuTracker(this.input, this.tracker);
    menu.fillActions();
    this.range = new int[menu.lengthAction()];
    for (int index = 0; index < this.range.length; index++) {
      this.range[index] = index + 1;
    }
    int key;
    do {
      menu.showMenu();
      key = input.ask("Select:", this.range);
      menu.select(key);
    } while (key != 7);
  }
  public static void main(String[] args) {
    new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
  }
}
