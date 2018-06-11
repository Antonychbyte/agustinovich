package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *class TrackerTest - решение задачи "2. Реализовать класс Tracker [#396]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class TrackerTest {

  @Test
  public void whenAddNewItemThenTrackerHasSameItem() {
    Item item = new Item("test1");
    Tracker tracker = new Tracker();
    tracker.add(item);
    assertThat(tracker.getItems()[0], is(item));
  }
  @Test
  public void whenReplaceNameThenReturnNewName() {

    Tracker tracker = new Tracker();
    Item previous = new Item("1");
    tracker.add(previous);
    Item next = new Item("2");
    next.setId(previous.getId());
    tracker.replace(previous.getId(), next);
    assertThat(tracker.findById(previous.getId()).getName(), is("2"));
  }
  @Test
  public void whenDeleteFirstThenSecondBecomesFirst() {
    Tracker tracker = new Tracker();
    Item first = new Item("First");
    Item second = new Item("second");
    tracker.add(first);
    tracker.add(second);
    tracker.delete(first.getId());
    assertThat(tracker.getItems()[0].getName(), is("second"));

  }
  @Test
  public void whenFindAllThenReturnWithoutNull() {
    Tracker tracker = new Tracker();
    Item first = new Item("first");
    Item second = new Item("second");
    tracker.add(first);
    tracker.add(second);
    Item[] expect = {first, second};
    assertThat(tracker.findAll(), is(expect));
  }
  @Test
  public void whenFindByName1thenReturnFirstAndSecond() {
    Tracker tracker = new Tracker();
    Item first  = new Item("1");
    Item second = new Item("2");
    Item third = new Item("1");
    tracker.add(first);
    tracker.add(second);
    tracker.add(third);
    Item[] expect = {first, third};
    assertThat(tracker.findByName("1"), is(expect));
  }
  @Test
  public void whenFindById33ThenItemNameIs1() {
    Tracker tracker = new Tracker();
    tracker.add(new Item("1"));
    tracker.add(new Item("2"));
    tracker.getItems()[0].setId("33");
    assertThat(tracker.findById("33").getName(), is("1"));
  }
}