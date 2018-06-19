package pseudo;

import org.junit.After;
import org.junit.Before;
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

  private final PrintStream stdout = System.out;
  private final ByteArrayOutputStream out = new ByteArrayOutputStream();

  @Before
  public void changeOut() {
    System.setOut(new PrintStream(this.out));
  }

  @After
  public void backOut() {
    System.setOut(this.stdout);
  }

  @Test
  public void whenDrawSquare() {

    new Paint().draw(new Square());
    assertThat(out.toString(), is(new StringBuilder()
        .append("_____\n")
        .append("|   |\n")
        .append("|___|")
        .append("\n")
        .toString()));
  }
  @Test
  public void whenDrawTriangle() {
    new Paint().draw(new Triangle());
    assertThat(out.toString(), is(new StringBuilder()
        .append("_____\n")
        .append("|   /\n")
        .append("|  /\n")
        .append("| /\n")
        .append("|/")
        .append("\n")
        .toString()));
  }
}
