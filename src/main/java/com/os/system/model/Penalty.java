package com.os.system.model;


public class Penalty {

  private long id;
  private String sId;
  private double money;
  private long disciplineId;
  private String remark;
  private long isPay;


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


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getDisciplineId() {
    return disciplineId;
  }

  public void setDisciplineId(long disciplineId) {
    this.disciplineId = disciplineId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public long getIsPay() {
    return isPay;
  }

  public void setIsPay(long isPay) {
    this.isPay = isPay;
  }

}
