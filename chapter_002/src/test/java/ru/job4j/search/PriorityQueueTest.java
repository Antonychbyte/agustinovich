package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {

  @Test
  public void whenHighPriority() {

    PriorityQueue pq = new PriorityQueue();
    pq.put(new Task("4", 4));
    pq.put(new Task("4", 4));
    pq.put(new Task("2", 2));
    pq.put(new Task("3", 3));
    pq.put(new Task("5", 5));
    pq.put(new Task("1", 1));
    pq.put(new Task("2", 2));

    assertThat(pq.take().getPriority(), is(1));
  }
}
