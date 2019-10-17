package com.os.system.model;

public class HomeworkRelease {

  private long id;
  private java.sql.Date hwReleaseTime;
  private java.sql.Timestamp hwDeadline;
  private long hwType;
  private String hwContent;
  private String hwNameing;
  private String hwComponent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Date getHwReleaseTime() {
    return hwReleaseTime;
  }

  public void setHwReleaseTime(java.sql.Date hwReleaseTime) {
    this.hwReleaseTime = hwReleaseTime;
  }


  public java.sql.Timestamp getHwDeadline() {
    return hwDeadline;
  }

  public void setHwDeadline(java.sql.Timestamp hwDeadline) {
    this.hwDeadline = hwDeadline;
  }


  public long getHwType() {
    return hwType;
  }

  public void setHwType(long hwType) {
    this.hwType = hwType;
  }


  public String getHwContent() {
    return hwContent;
  }

  public void setHwContent(String hwContent) {
    this.hwContent = hwContent;
  }


  public String getHwNameing() {
    return hwNameing;
  }

  public void setHwNameing(String hwNameing) {
    this.hwNameing = hwNameing;
  }


  public String getHwComponent() {
    return hwComponent;
  }

  public void setHwComponent(String hwComponent) {
    this.hwComponent = hwComponent;
  }

}
