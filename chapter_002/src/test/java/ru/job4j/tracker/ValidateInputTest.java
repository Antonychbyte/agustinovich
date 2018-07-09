package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ValidateInputTest {

  private final PrintStream stdOut = System.out;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();
  private final String ls = System.lineSeparator();
  private final String menu = new StringBuilder()
      .append("Menu:").append(ls)
      .append("1. Add new item").append(ls)
      .append("2. Show all items").append(ls)
      .append("3. Edit item").append(ls)
      .append("4. Delete item").append(ls)
      .append("5. Find item by id").append(ls)
      .append("6. Find items by name").append(ls)
      .append("7. Exit program").append(ls)
      .append("Select:").append(ls)
      .toString();
  @Before
  public void switchOut() {
    System.setOut(new PrintStream(this.out));
  }
  @After
  public void backOut() {
    System.setOut(this.stdOut);
  }

  @Test
  public void whenInvalidFormatInput() {
    ValidateInput input = new ValidateInput(new StubInput(new String[] {"invalid", "1"}));
    input.ask("Select:", new int[] {1});
    assertThat(out.toString(), is(String.format(new StringBuilder()
        .append("Select:").append(ls)
        .append("при вводе пункта меню используйте только цифры").append(ls)
        .append(this.menu)
    .toString())));
  }
  @Test
  public void whenInvalidRangeInput() {
    ValidateInput input = new ValidateInput(new StubInput(new String[] {"0", "1"}));
    input.ask("Select:", new int[] {1});
    assertThat(out.toString(), is(String.format(new StringBuilder()
        .append("Select:").append(ls)
        .append("выберите пункт меню").append(ls)
        .append(this.menu)
    .toString())));
  }
}
