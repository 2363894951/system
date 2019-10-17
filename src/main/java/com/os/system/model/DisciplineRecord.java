package com.os.system.model;


public class DisciplineRecord {

  private long id;
  private String sId;
  private java.sql.Date disciplineTime;
  private long disciplineItem;
  private String detail;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getSId() {
    return sId;
  }

  public void setSId(String sId) {
    this.sId = sId;
  }


  public java.sql.Date getDisciplineTime() {
    return disciplineTime;
  }

  public void setDisciplineTime(java.sql.Date disciplineTime) {
    this.disciplineTime = disciplineTime;
  }


  public long getDisciplineItem() {
    return disciplineItem;
  }

  public void setDisciplineItem(long disciplineItem) {
    this.disciplineItem = disciplineItem;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

}
