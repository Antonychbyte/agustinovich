package tracker;

public class StartUI {

  private static final String ADD = "0";
  private static final String SHOWALL = "1";
  private static final String EDIT = "2";
  private static final String DELETE = "3";
  private static final String FINDBYID = "4";
  private static final String FINDBYNAME = "5";
  private static final String EXIT = "6";

  private final Input input;
  private final Tracker tracker;

  public StartUI(Input input, Tracker tracker){
    this.input = input;
    this.tracker = tracker;
  }

  public void init(){
    boolean exit = false;
    while (!exit){
      this.printMenu();
      String answer = input.ask("введите пункт меню");
      if(answer.equals(ADD)){
        this.createItem();
      }else if (answer.equals(SHOWALL)){
        this.showAll();
      }else if (answer.equals(EDIT)){
        this.editItem();
      }else if (answer.equals(DELETE)){
        this.delete();
      }else if (answer.equals(FINDBYID)){
        this.findById();
      }else if (answer.equals(FINDBYNAME)){
        this.findByName();
      }else if (answer.equals(EXIT)){
        exit = true;
      }
    }
  }
  public void printMenu() {
    System.out.println("Menu");
    System.out.println(ADD + ". Add new Item");
    System.out.println(SHOWALL + ". Show all items");
    System.out.println(EDIT + ". Edit item");
    System.out.println(DELETE + ". Delete item");
    System.out.println(FINDBYID + ". Find item by Id");
    System.out.println(FINDBYNAME + ". Find items by name");
    System.out.println(EXIT + ". Exit Program");
    System.out.print("Select:");
  }
  public void createItem(){
    System.out.println("----------Создание новой заявки---------");
    String name = input.ask("введите имя:");
    String desc = input.ask("введите описание заявки:");
    String comment = input.ask("введите коментарий:");
    Item item = new Item(name, desc, comment);
    tracker.add(item);
    System.out.println("-------Новая заявка с ID:" + item.getId() + " создана.---------");
  }
  public void showAll(){
    System.out.println("Список всех заявок:");
    Item [] list = tracker.findAll();
    for (Item item : list) {
      System.out.println(item.getId() + "___" + item.getName());
    }
  }
  public void editItem(){
    System.out.println("----------Редактирование заявки----------");
    String id = input.ask("введите ID заявки:");
    System.out.println("создание заявки с уточненными данными");
    String name = input.ask("введите имя:");
    String desc = input.ask("введите описание заявки:");
    String comment = input.ask("введите коментарий:");
    Item item = new Item(name, desc, comment);
    tracker.replace(id,item);
    System.out.println("внесены изменения в заявку с ID "+item.getId());
  }
  public void delete(){
    System.out.println("----------Удаление заявки--------");
    String id = input.ask("введите ID заявки, которую нужно удалить:");
    tracker.delete(id);
    System.out.println("Заявка удалена");
  }
  public void findById(){
    System.out.println("----------Поиск заявки по ID----------");
    String id = input.ask("введите ID заявки:");
    Item item = tracker.findById(id);
    System.out.println("ID: " + item.getId());
    System.out.println("Имя: " + item.getName());
    System.out.println("Описание: " + item.getDesc());
    System.out.println("Коментарий: " + item.getComments());
  }
  public void findByName(){
    System.out.println("------- Поиск заявки по имени------");
    String name = input.ask("Введите имя: ");
    Item[] items = tracker.findByName(name);
    for(Item item : items){
      System.out.println(item.getId() + "___" + item.getName());
    }
  }
  public static void main(String[] args) {
    new StartUI(new ConsoleInput(), new Tracker()).init();
  }
}
