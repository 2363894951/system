package com.os.system.model;


public class Role {

  private long id;
  private String roleName;
  private String roleDetail;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleDetail() {
    return roleDetail;
  }

  public void setRoleDetail(String roleDetail) {
    this.roleDetail = roleDetail;
  }

}
