package com.os.system.model;


public class SalaryTemplate {

  private long id;
  private String sId;
  private long basicWage;
  private long postWage;
  private long performancePay;
  private long salary;


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


  public long getBasicWage() {
    return basicWage;
  }

  public void setBasicWage(long basicWage) {
    this.basicWage = basicWage;
  }


  public long getPostWage() {
    return postWage;
  }

  public void setPostWage(long postWage) {
    this.postWage = postWage;
  }


  public long getPerformancePay() {
    return performancePay;
  }

  public void setPerformancePay(long performancePay) {
    this.performancePay = performancePay;
  }


  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

}
