package ru.job4j.tracker;

public interface UserAction {

  int key();
  String menuItem();
  void execute(Input input, Tracker tracker);
}