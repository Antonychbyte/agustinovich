package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

  private LinkedList<Task> tasks = new LinkedList<>();

  public Task take() {
    return this.tasks.poll();
  }
  public void put(Task newTask) {
    int index = 0;
    for (Task task : this.tasks) {
      if (newTask.getPriority() <= task.getPriority()) {
        index = this.tasks.indexOf(task);
        break;
      }
      index++;
    }
    this.tasks.add(index, newTask);
  }
}
