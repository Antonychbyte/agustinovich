package ru.job4j.tracker;

public class MenuTracker {

  private Input input;
  private Tracker tracker;
  private UserAction[] actions = new UserAction[7];

  public MenuTracker(Input input, Tracker tracker) {
    this.input = input;
    this.tracker = tracker;
  }

  public void fillActions() {
    this.actions[0] = new AddItem();
    this.actions[1] = new ShowAllItems();
    this.actions[2] = new EditItem();
    this.actions[3] = new DeleteItem();
    this.actions[4] = new FindItemById();
    this.actions[5] = new FindItemsByName();
    this.actions[6] = new ExitProgram();

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

  private class AddItem implements UserAction {
    @Override
    public int key() {
      return 1;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", this.key(), "Add new item");
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
  private static class ShowAllItems implements UserAction {
    @Override
    public int key() {
      return 2;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", key(), "Show all items");
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("Список всех заявок:");
      for (Item item : tracker.findAll()) {
        System.out.println(String.format("%s%s%s", item.getId(), "___", item.getName()));
      }
    }
  }
  public int key() {
    return 10;
  }
  private class DeleteItem implements UserAction {
    @Override
    public int key() {
      return 4;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", key(), "Delete item");
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("----------Удаление заявки--------");
      String id = input.ask("введите ID заявки, которую нужно удалить:");
      tracker.delete(id);
      System.out.println("Заявка удалена");
    }
  }
  private class FindItemById implements UserAction {
    @Override
    public int key() {
      return 5;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", this.key(), "Find item by id");
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
  private class FindItemsByName implements UserAction {
    @Override
    public int key() {
      return 6;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", this.key(), "Find items by name");
    }
    @Override
    public void execute(Input input, Tracker tracker) {
      System.out.println("------- Поиск заявки по имени------");
      String name = input.ask("Введите имя:");
      Item[] items = tracker.findByName(name);
      for (Item item : items) {
        System.out.println(String.format("%s%s%s", item.getId(), "___", item.getName()));
      }
    }
  }
  private class ExitProgram implements UserAction {
    @Override
    public int key() {
      return 7;
    }
    @Override
    public String menuItem() {
      return String.format("%s. %s", key(), "Exit program");
    }
    @Override
    public void execute(Input input, Tracker tracker) {
    }
  }

}
class EditItem implements UserAction {
  @Override
  public int key() {
    return 3;
  }
  @Override
  public String menuItem() {
    return String.format("%s. %s", this.key(), "Edit item");
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