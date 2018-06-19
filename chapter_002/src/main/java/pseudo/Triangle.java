package pseudo;
/**
 * class Triangle - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class Triangle implements Shape {
  @Override
  public String draw() {
    StringBuilder pic = new StringBuilder();
    pic.append("_____\n")
       .append("|   /\n")
       .append("|  /\n")
       .append("| /\n")
       .append("|/");
    return pic.toString();
  }
}
