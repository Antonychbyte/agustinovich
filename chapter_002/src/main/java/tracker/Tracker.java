package tracker;

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
    this.items[this.position++] = item;
  }
  public void replace(String id, Item item) {
    for (int index = 0; index <= this.position - 1; index++) {
      if (this.items[index].getId().equals(id)) {
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
    int sizeResult = 0;
    for (Item temp : this.items) {
      if (temp == null) {
        break;
      }
      if (temp.getName().equals(key)) {
        sizeResult++;
      }
    }
    Item[] result = new Item[sizeResult];
    int indexItems = 0;
    int indexResult = 0;
    for ( ; indexItems <= this.position - 1; indexItems++) {
      if (this.items[indexItems] == null) {
        break;
      }
      if (this.items[indexItems].getName().equals(key)) {
        result[indexResult] = this.items[indexItems];
        indexResult++;
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

