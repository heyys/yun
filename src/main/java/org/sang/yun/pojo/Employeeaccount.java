package org.sang.yun.pojo;

public class Employeeaccount {
    private Integer id;

    private String empName;

    private String clLogin;

    private String empNumber;

    private Integer departId;

    private String empPosition;

    private String empPhone;

    private String empJulisdiction;

    private Integer roleId;

    private Integer empStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getClLogin() {
        return clLogin;
    }

    public void setClLogin(String clLogin) {
        this.clLogin = clLogin == null ? null : clLogin.trim();
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber == null ? null : empNumber.trim();
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition == null ? null : empPosition.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpJulisdiction() {
        return empJulisdiction;
    }

    public void setEmpJulisdiction(String empJulisdiction) {
        this.empJulisdiction = empJulisdiction == null ? null : empJulisdiction.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }
}