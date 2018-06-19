package pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * class Square - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 *
 */
public class PaintTest {
  @Test
  public void whenDrawSquare() {
    PrintStream stdout = System.out;
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    new Paint().draw(new Square());
    assertThat(out.toString(), is(new StringBuilder()
        .append("_____\n")
        .append("|   |\n")
        .append("|___|")
        .append("\n")
        .toString()));
    System.setOut(stdout);
  }
  @Test
  public void whenDrawTriangle() {
    PrintStream stdout = System.out;
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    new Paint().draw(new Triangle());
    assertThat(out.toString(), is(new StringBuilder()
        .append("_____\n")
        .append("|   /\n")
        .append("|  /\n")
        .append("| /\n")
        .append("|/")
        .append("\n")
        .toString()));
    System.setOut(stdout);
  }
}
