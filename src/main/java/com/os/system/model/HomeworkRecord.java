package com.os.system.model;

public class HomeworkRecord {

  private long id;
  private String sId;
  private String hwSubmissionState;
  private long hwReleaseId;


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


  public String getHwSubmissionState() {
    return hwSubmissionState;
  }

  public void setHwSubmissionState(String hwSubmissionState) {
    this.hwSubmissionState = hwSubmissionState;
  }


  public long getHwReleaseId() {
    return hwReleaseId;
  }

  public void setHwReleaseId(long hwReleaseId) {
    this.hwReleaseId = hwReleaseId;
  }

}
