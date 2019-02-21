package ru.job4j.tracker;

import java.util.*;

/**
 *class Tracker - решение задачи "2. Реализовать класс Tracker [#396]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
class Tracker {

  private final List<Item> items = new ArrayList<>();
  private final static Random RN = new Random();

  public List<Item> getItems() {
    return this.items;
  }
  public void add(Item item) {
    item.setId(this.generateId());
    item.setCreated(System.currentTimeMillis());
    this.items.add(item);
  }
  public void replace(String id, Item newItem) {
    for (int index = 0; index < this.items.size(); index++) {
      if (this.items.get(index).getId().equals(id)) {
        this.items.set(index, newItem);
        break;
      }
    }
  }
  public void delete(String id) {
    for (int index = 0; index < this.items.size(); index++) {
      if (this.items.get(index).getId().equals(id)) {
        this.items.remove(index);
        break;
      }
    }
  }
  public List<Item> findAll() {
    return getItems();
  }
  public List<Item> findByName(String key) {
    List<Item> result = new ArrayList<>();
    for (Item element : this.items) {
      if (element.getName().equals(key)) {
        result.add(element);
      }
    }
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

