package pseudo;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class TriangleTest - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class TriangleTest {
  @Test
  public void whenDrawTriangle() {
    Triangle triangle = new Triangle();
    assertThat(triangle.draw(), is(new StringBuilder().append("_____\n")
                                                      .append("|   /\n")
                                                      .append("|  /\n")
                                                      .append("| /\n")
                                                      .append("|/")
                                                      .toString()));
  }
}
