package ru.job4j.search;

public class Person {

  private String name;
  private String surname;
  private String phone;
  private String address;

  public Person(String name, String surname, String phone, String address) {
    this.name = name;
    this.surname = surname;
    this.phone = phone;
    this.address = address;
  }

  public String getName() {
    return name;
  }
  public String getPhone() {
    return phone;
  }
  public String getSurname() {
    return surname;
  }
  public String getAddress() {
    return address;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    Person p = (Person) o;
      if (
        this.name.equals(p.getName())
        && this.surname.equals(p.getSurname())
        && this.phone.equals(p.getPhone())
        && this.address.equals(p.getAddress())
        ) {
      return true;
    }
    return false;
  }
}
