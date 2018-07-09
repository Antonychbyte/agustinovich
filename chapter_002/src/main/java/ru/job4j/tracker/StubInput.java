package ru.job4j.tracker;

public class StubInput implements Input {

  private String[] answers;
  private int position = 0;

  public StubInput(String[] answers) {
    this.answers = answers;
  }

  public String ask(String question) {
    System.out.println(question);
    return answers[position++];
  }
  public int ask(String question, int[] range) {
      int key = Integer.valueOf(this.ask(question));
      boolean exist = false;
      for (int value : range) {
        if (key == value) {
          exist = true;
          break;
        }
      }
      if (exist) {
        return key;
      } else {
        throw new MenuOutException("выберите пункт меню");
      }
  }
}
