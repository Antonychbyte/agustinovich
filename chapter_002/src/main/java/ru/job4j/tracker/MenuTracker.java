package ru.job4j.tracker;

import java.util.List;

public class MenuTracker {

  private Input input;
  private Tracker tracker;
  private UserAction[] actions = new UserAction[7];
  private int position = 0;
  public MenuTracker() {
  }
  public MenuTracker(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
  }
  int lengthAction() {
    return this.actions.length;
  }
  public void fillActions() {
    this.actions[position++] = new AddItem(1, "Add new item");
    this.actions[position++] = new ShowAllItems(2, "Show all items");
    this.actions[position++] = new EditItem(3, "Edit item");
    this.actions[position++] = new DeleteItem(4, "Delete item");
    this.actions[position++] = new FindItemById(5, "Find item by id");
    this.actions[position++] = new FindItemsByName(6, "Find items by name");
    this.actions[position++] = new ExitProgram(7, "Exit program");
  }
  public void showMenu() {
    System.out.println("Menu:");
    for (UserAction action : this.actions) {
      if (action == null) {
        break;
      }
      System.out.println(action.menuItem());
    }
  }
  public void select(int key) {
    this.actions[key - 1].execute(this.input, this.tracker);
  }

  private class AddItem extends BaseAction {
    public AddItem(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("----------Создание новой заявки---------");
      String name = input.ask("введите имя:");
      String desc = input.ask("введите описание заявки:");
      Item item = new Item(name, desc);
      tracker.add(item);
      System.out.println(String.format("%s %s %s", "-------Новая заявка с ID:", item.getId(), " создана.---------"));
    }
  }
  private static class ShowAllItems extends BaseAction {
    public ShowAllItems(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("Список всех заявок:");
      for (Item item : tracker.findAll()) {
        System.out.println(String.format("%s%s%s", item.getId(), "___", item.getName()));
      }
    }
  }

  private class DeleteItem extends BaseAction {
    public DeleteItem(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("----------Удаление заявки--------");
      String id = input.ask("введите ID заявки, которую нужно удалить:");
      tracker.delete(id);
      System.out.println("Заявка удалена");
    }
  }
  private class FindItemById extends BaseAction {
    public FindItemById(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("----------Поиск заявки по ID----------");
      String id = input.ask("введите ID заявки:");
      Item item = tracker.findById(id);
      System.out.println(String.format("%s %s", "ID:", item.getId()));
      System.out.println(String.format("%s %s", "Имя:", item.getName()));
      System.out.println(String.format("%s %s", "Описание:", item.getDesc()));
    }
  }
  private class FindItemsByName extends BaseAction {
    public FindItemsByName(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("------- Поиск заявки по имени------");
      String name = input.ask("Введите имя:");
      List<Item> items = tracker.findByName(name);
      for (Item item : items) {
        System.out.println(String.format("%s%s%s", item.getId(), "___", item.getName()));
      }
    }
  }
  private class ExitProgram extends BaseAction {
    public ExitProgram(int key, String name) {
      super(key, name);
    }
    @Override
    public void execute(Input input, Tracker tracker) {
    }
  }

}
class EditItem extends BaseAction {
  public EditItem(int key, String name) {
    super(key, name);
  }
  @Override
  public void execute(Input input, Tracker tracker) {
    System.out.println("----------Редактирование заявки----------");
    String id = input.ask("введите ID заявки:");
    System.out.println("создание заявки с уточненными данными");
    String name = input.ask("введите имя:");
    String desc = input.ask("введите описание заявки:");
    Item item = new Item(name, desc);
    tracker.replace(id, item);
    System.out.println(String.format("%s %s", "внесены изменения в заявку с ID ", item.getId()));
  }
}