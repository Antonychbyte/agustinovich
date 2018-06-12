package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class StartUITest {

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
}
