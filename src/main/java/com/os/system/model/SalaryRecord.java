package com.os.system.model;

public class SalaryRecord {

  private long id;
  private String sId;
  private String salaryDate;
  private long attendanceDay;
  private long attendanceDeductions;
  private long penalty;
  private long other;
  private long realWage;


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


  public String getSalaryDate() {
    return salaryDate;
  }

  public void setSalaryDate(String salaryDate) {
    this.salaryDate = salaryDate;
  }


  public long getAttendanceDay() {
    return attendanceDay;
  }

  public void setAttendanceDay(long attendanceDay) {
    this.attendanceDay = attendanceDay;
  }


  public long getAttendanceDeductions() {
    return attendanceDeductions;
  }

  public void setAttendanceDeductions(long attendanceDeductions) {
    this.attendanceDeductions = attendanceDeductions;
  }


  public long getPenalty() {
    return penalty;
  }

  public void setPenalty(long penalty) {
    this.penalty = penalty;
  }


  public long getOther() {
    return other;
  }

  public void setOther(long other) {
    this.other = other;
  }


  public long getRealWage() {
    return realWage;
  }

  public void setRealWage(long realWage) {
    this.realWage = realWage;
  }

}
