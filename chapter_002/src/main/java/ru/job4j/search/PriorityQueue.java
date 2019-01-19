package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {

 private LinkedList<Task> tasks = new LinkedList<>();

 public Task take() {
    return this.tasks.poll();
 }

 public void put(Task task) {
   if (this.tasks.size() == 0) {
     this.tasks.add(task);
     return;
   }
   for (Task element : this.tasks) {
     if (task.getPriority() <= element.getPriority()) {
       this.tasks.add(this.tasks.indexOf(element), task);
       break;
     }
   }
 }
}
