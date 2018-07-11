package ru.job4j.tracker;

public class StubInput extends ConsoleInput {

  private String[] answers;
  private int position = 0;

  public StubInput(String[] answers) {
    this.answers = answers;
  }
  @Override
  public String ask(String question) {
    System.out.println(question);
    return answers[position++];
  }
}
