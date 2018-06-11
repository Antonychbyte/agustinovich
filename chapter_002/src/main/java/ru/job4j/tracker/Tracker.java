package ru.job4j.tracker;

import java.util.Random;

/**
 *class Tracker - решение задачи "2. Реализовать класс Tracker [#396]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
class Tracker {

  private final Item[] items = new Item[100];
  private int position = 0;
  private final static Random RN = new Random();

  public Item[] getItems() {
    return this.items;
  }
  public void add(Item item) {
    item.setId(this.generateId());
    item.setCreated(System.currentTimeMillis());
    this.items[this.position++] = item;
  }
  public void replace(String id, Item item) {
    for (int index = 0; index <= this.position - 1; index++) {
      if (this.items[index].getId().equals(id)) {
        item.setId(this.items[index].getId());
        item.setCreated(System.currentTimeMillis());
        this.items[index] = item;
        break;
      }
    }
  }
  public void delete(String id) {
    for (int index = 0; index <= this.position - 1; index++) {
      if (this.items[index].getId().equals(id)) {
        System.arraycopy(this.items, index + 1, this.items, index, this.position - 1 - index);
        this.position--;
        this.items[this.position] = null;
        break;
      }
    }
  }
  public Item[] findAll() {
    Item[] result = new Item[position];
    for (int index = 0; index <= position - 1; index++) {
      result[index] = this.items[index];
    }
    return result;
  }
  public Item[] findByName(String key) {
    Item[] names = new Item[this.position];
    int k = 0;
    for (int index = 0; index < this.position; index++) {
      if (key != null && this.items[index].getName().equals(key)) {
        names[k] = items[index];
        k++;
      }
    }
    Item[] result = new Item[k];
    System.arraycopy(names, 0, result, 0, k);
    return result;
  }
  public Item findById(String id) {
    Item result = null;
    for (Item item : this.items) {
      if (item != null && item.getId().equals(id)) {
        result = item;
        break;
      }
    }
    return result;
  }
  private String generateId() {
    StringBuilder id = new StringBuilder();
    id.append(System.currentTimeMillis());
    id.append(Math.abs(RN.nextInt()));
    return id.toString();
  }
}

