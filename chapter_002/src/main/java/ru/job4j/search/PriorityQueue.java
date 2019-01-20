package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

  private LinkedList<Task> tasks = new LinkedList<>();

  public Task take() {
    return this.tasks.poll();
  }
  public void put(Task newTask) {
    if (this.tasks.size() == 0) {
      this.tasks.add(newTask);
      return;
    }
    for (Task task : this.tasks) {
      if (newTask.getPriority() <= task.getPriority()) {
        this.tasks.add(this.tasks.indexOf(task), newTask);
        break;
      }
      if (this.tasks.indexOf(task) == (this.tasks.size() - 1)) {
        this.tasks.add(newTask);
        break;
      }
    }
  }
}
