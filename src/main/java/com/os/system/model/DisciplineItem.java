package com.os.system.model;

public class DisciplineItem {

  private long id;
  private String itemName;
  private long pennalty;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public long getPennalty() {
    return pennalty;
  }

  public void setPennalty(long pennalty) {
    this.pennalty = pennalty;
  }

}
