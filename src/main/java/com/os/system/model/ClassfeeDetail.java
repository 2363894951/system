package com.os.system.model;


public class ClassfeeDetail {

  private long id;
  private String iEname;
  private long incomeOrExpend;
  private long money;
  private String detail;
  private java.sql.Date ieDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getIEname() {
    return iEname;
  }

  public void setIEname(String iEname) {
    this.iEname = iEname;
  }


  public long getIncomeOrExpend() {
    return incomeOrExpend;
  }

  public void setIncomeOrExpend(long incomeOrExpend) {
    this.incomeOrExpend = incomeOrExpend;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public java.sql.Date getIeDate() {
    return ieDate;
  }

  public void setIeDate(java.sql.Date ieDate) {
    this.ieDate = ieDate;
  }

}
