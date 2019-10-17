package com.os.system.model;

public class MonthFee {

  private long id;
  private String sId;
  private String yearMonth;
  private double money;
  private java.sql.Date payDate;
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


  public String getYearMonth() {
    return yearMonth;
  }

  public void setYearMonth(String yearMonth) {
    this.yearMonth = yearMonth;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public java.sql.Date getPayDate() {
    return payDate;
  }

  public void setPayDate(java.sql.Date payDate) {
    this.payDate = payDate;
  }


  public long getIsPay() {
    return isPay;
  }

  public void setIsPay(long isPay) {
    this.isPay = isPay;
  }

}
