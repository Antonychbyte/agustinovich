package pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * class SquareTest - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class SquareTest {
  @Test
  public void whenDrawSquare() {
    Square square = new Square();
    assertThat(square.draw(), is(new StringBuilder().append("_____\n")
                                                    .append("|   |\n")
                                                    .append("|___|")
                                                    .toString()));
  }
 }


