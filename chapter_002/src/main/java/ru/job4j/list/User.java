package ru.job4j.list;

import java.util.Objects;
/**
 * 2. Написать программу преобразования List в Map. [#10093]
 */
public class User {

  int id;
  String name;
  String city;

  public User(int id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    User u = (User) o;
    if (
        this.name.equals(u.getName())
            && this.id == u.getId()
            && this.city.equals(u.getCity())
        ) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, city);
  }
}

