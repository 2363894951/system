package com.os.system.model;


public class Duty {

  private long id;
  private String dutyName;
  private long departmentId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDutyName() {
    return dutyName;
  }

  public void setDutyName(String dutyName) {
    this.dutyName = dutyName;
  }


  public long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(long departmentId) {
    this.departmentId = departmentId;
  }

}
