package com.os.system.model;


public class AttendanceRecord {

  private long id;
  private String sId;
  private java.sql.Date attendanceDate;
  private long attendanceState;


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


  public java.sql.Date getAttendanceDate() {
    return attendanceDate;
  }

  public void setAttendanceDate(java.sql.Date attendanceDate) {
    this.attendanceDate = attendanceDate;
  }


  public long getAttendanceState() {
    return attendanceState;
  }

  public void setAttendanceState(long attendanceState) {
    this.attendanceState = attendanceState;
  }

}
