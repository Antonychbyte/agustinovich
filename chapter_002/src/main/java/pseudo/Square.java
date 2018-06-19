package pseudo;
/**
 * class Square - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class Square implements Shape {
  @Override
  public String draw() {
    StringBuilder pic = new StringBuilder();
    pic.append("_____\n")
       .append("|   |\n")
       .append("|___|");
    return pic.toString();

  }
}
