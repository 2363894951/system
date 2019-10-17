package com.os.system.model;


public class Student {

  private String sId;
  private String sName;
  private String gender;
  private java.sql.Date birthdate;
  private String address;
  private String phone;
  private String email;
  private long dutyId;


  public String getSId() {
    return sId;
  }

  public void setSId(String sId) {
    this.sId = sId;
  }


  public String getSName() {
    return sName;
  }

  public void setSName(String sName) {
    this.sName = sName;
  }


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public java.sql.Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(java.sql.Date birthdate) {
    this.birthdate = birthdate;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getDutyId() {
    return dutyId;
  }

  public void setDutyId(long dutyId) {
    this.dutyId = dutyId;
  }

}
