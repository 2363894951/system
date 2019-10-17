package com.os.system.model;


public class ClassfeeIncomeExpend {

  private long id;
  private long income;
  private long expend;
  private long balance;
  private String yearMonth;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getIncome() {
    return income;
  }

  public void setIncome(long income) {
    this.income = income;
  }


  public long getExpend() {
    return expend;
  }

  public void setExpend(long expend) {
    this.expend = expend;
  }


  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }


  public String getYearMonth() {
    return yearMonth;
  }

  public void setYearMonth(String yearMonth) {
    this.yearMonth = yearMonth;
  }

}
