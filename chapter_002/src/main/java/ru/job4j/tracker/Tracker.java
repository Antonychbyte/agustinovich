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
  public boolean replace(String id, Item newItem) {
    boolean result = false;
    newItem.setId(id);
    newItem.setCreated(System.currentTimeMillis());
    ListIterator<Item> iterator = this.items.listIterator();
    while (iterator.hasNext()) {
      Item next = iterator.next();
      if (next.getId().equals(newItem.getId())) {
        iterator.set(newItem);
        result = true;
        break;
      }
    }
    return result;
  }
  public boolean delete(String id) {
    boolean result = false;
    Iterator<Item> iterator = this.items.iterator();
    while (iterator.hasNext()) {
      Item next = iterator.next();
      if (next.getId().equals(id)) {
        iterator.remove();
        result = true;
        break;
      }
    }
    return result;
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

