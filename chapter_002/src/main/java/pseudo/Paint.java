package pseudo;
/**
 * class Paint - решение задачи "4. Используя шаблон проектирования - стратегию [#786]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
public class Paint {

  public void draw(Shape shape) {
    System.out.println(shape.draw());
  }
  public static void main(String[] args) {
    new Paint().draw(new Triangle());
    new Paint().draw(new Square());
  }
}
