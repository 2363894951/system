package com.os.system.model;

public class HomeworkSubmission {

  private long id;
  private String sId;
  private String hwCommons;
  private java.sql.Timestamp hwSumissionTime;
  private long hwReleaseId;
  private String hwRemark;


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


  public String getHwCommons() {
    return hwCommons;
  }

  public void setHwCommons(String hwCommons) {
    this.hwCommons = hwCommons;
  }


  public java.sql.Timestamp getHwSumissionTime() {
    return hwSumissionTime;
  }

  public void setHwSumissionTime(java.sql.Timestamp hwSumissionTime) {
    this.hwSumissionTime = hwSumissionTime;
  }


  public long getHwReleaseId() {
    return hwReleaseId;
  }

  public void setHwReleaseId(long hwReleaseId) {
    this.hwReleaseId = hwReleaseId;
  }


  public String getHwRemark() {
    return hwRemark;
  }

  public void setHwRemark(String hwRemark) {
    this.hwRemark = hwRemark;
  }

}
