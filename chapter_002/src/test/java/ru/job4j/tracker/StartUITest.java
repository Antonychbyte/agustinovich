package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

  private final PrintStream stdOut = System.out;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();
  private final String ls = System.lineSeparator();
  private final Tracker tracker = new Tracker();
  private final Item item1 = new Item("1");
  private final Item item2 = new Item("2");
  private final String menu = new StringBuilder()
      .append("Menu").append(ls)
      .append("0. Add new Item").append(ls)
      .append("1. Show all items").append(ls)
      .append("2. Edit item").append(ls)
      .append("3. Delete item").append(ls)
      .append("4. Find item by Id").append(ls)
      .append("5. Find items by name").append(ls)
      .append("6. Exit Program").append(ls)
      .append("Select:").append(ls)
      .toString();

  @Test
  public void whenAddTnenTrackerHasItemWithSameName() {
    Input input = new StubInput(new String[]{"0", "name", "desc", "comment", "6"});
    Tracker tracker = new Tracker();
    new StartUI(input, tracker).init();
    assertThat(tracker.getItems()[0].getName(), is("name"));
  }

  @Test
  public void whenEditThenTrackerHasItemWithNewName() {
    Item item = new Item("name");
    Tracker tracker = new Tracker();
    tracker.add(item);
    Input input = new StubInput(new String[]{"2", tracker.getItems()[0].getId(), "newName", "desc", "comment", "6"});
    new StartUI(input, tracker).init();
    assertThat(tracker.getItems()[0].getName(), is("newName"));
  }

  @Test
  public void whenDeleteThenTrackerHasNotItems() {
    Item item = new Item("1");
    Tracker tracker = new Tracker();
    tracker.add(item);
    Input input = new StubInput(new String[]{"3", tracker.getItems()[0].getId(), "6"});
    new StartUI(input, tracker).init();
    assertThat(tracker.findAll().length, is(0));
  }

  @Before
  public void switchOut() {
    System.setOut(new PrintStream(this.out));
    this.tracker.add(this.item1);
    this.tracker.add(this.item2);
  }
  @After
  public void backOut() {
    System.setOut(this.stdOut);
  }

  @Test
  public void outWhenShowAll() {
    Input input = new StubInput(new String[]{"1", "6"});
    new StartUI(input, this.tracker).init();
    assertThat(out.toString(), is(new StringBuilder()
        .append(this.menu)
        .append("Список всех заявок:").append(ls)
        .append(item1.getId()).append("___1").append(ls)
        .append(item2.getId()).append("___2").append(ls)
        .append(this.menu)
        .toString()));
  }
  @Test
  public void outWhenFyndById() {
    Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
    new StartUI(input, this.tracker).init();
    assertThat(out.toString(), is(new StringBuilder()
        .append(this.menu)
        .append("----------Поиск заявки по ID----------").append(ls)
        .append("ID: ").append(item1.getId()).append(ls)
        .append("Имя: ").append(item1.getName()).append(ls)
        .append("Описание: ").append(item1.getDesc()).append(ls)
        .append("Коментарий: ").append(item1.getComments()).append(ls)
        .append(this.menu)
        .toString()));
  }
  @Test
  public void outWhenFyndByName() {
    Input input = new StubInput(new String[]{"5", "1", "6"});
    new StartUI(input, this.tracker).init();
    assertThat(out.toString(), is(new StringBuilder()
        .append(this.menu)
        .append("------- Поиск заявки по имени------").append(ls)
        .append(this.item1.getId()).append("___").append(item1.getName()).append(ls)
        .append(this.menu)
        .toString()));
  }
}
