package ru.job4j.tracker;

public class Item {

  private String id;
  private String name;
  private String desc;
  private String comments;
  private long created;
 public Item(String name) {
   this.setName(name);
 }
 public Item(String name, String desc, String comments) {
    this.setName(name);
    this.setDesc(desc);
    this.setComments(comments);
  }

  public void setId(String id) {
    this.id = id;
  }
  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }
  public String getDesc() {
    return desc;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }
  public String getComments() {
    return comments;
  }

  public void setCreated(long created) {
    this.created = created;
  }
  public long getCreated() {
    return created;
  }
}
