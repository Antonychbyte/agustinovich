package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

/**
 *class Tracker - решение задачи "2. Реализовать класс Tracker [#396]"
 * @author Густинович Антон (anton14024@yandex.ru)
 */
class Tracker {

  private final ArrayList<Item> items = new ArrayList<>();
  private final static Random RN = new Random();

  public ArrayList<Item> getItems() {
    return this.items;
  }
  public void add(Item item) {
    item.setId(this.generateId());
    item.setCreated(System.currentTimeMillis());
    this.items.add(item);
  }
  public void replace(String id, Item item) {
    for (Item element : this.items) {
      if (element.getId().equals(id)) {
        item.setId(id);
        item.setCreated(System.currentTimeMillis());
        this.items.set(this.items.indexOf(element), item);
      }
    }
  }
  public void delete(String id) {
    for (Item element : this.items) {
      if (element.getId().equals(id)) {
        this.items.remove(this.items.indexOf(element));
        break;
      }
    }
  }
  public ArrayList<Item> findAll() {
    ArrayList<Item> result = new ArrayList<>();
    result.addAll(this.items);
    return result;
  }
  public ArrayList<Item> findByName(String key) {
    ArrayList<Item> result = new ArrayList<>();
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

