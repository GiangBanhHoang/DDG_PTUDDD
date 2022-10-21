package com.example.ddg_vip.model;

import java.util.Date;

public class User {
    private Integer IdUser;
    private String UserName;
    private String Address;
    private String UsePassword;
    private String FullName;
    private Date BrithDay;
    private String Gender;
    private String Mail;
    private String Phone;
    private String Role;
    private String Qualification;
    private Integer Salary;
    private String Start_working;

    public User() {
    }

    public User(Integer idUser, String userName, String address, String usePassword,
                String fullName, Date brithDay, String gender, String mail, String phone,
                String role, String qualification, Integer salary, String start_working) {
        IdUser = idUser;
        UserName = userName;
        Address = address;
        UsePassword = usePassword;
        FullName = fullName;
        BrithDay = brithDay;
        Gender = gender;
        Mail = mail;
        Phone = phone;
        Role = role;
        Qualification = qualification;
        Salary = salary;
        Start_working = start_working;
    }

    public Integer getIdUser() {
        return IdUser;
    }

    public void setIdUser(Integer idUser) {
        IdUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUsePassword() {
        return UsePassword;
    }

    public void setUsePassword(String usePassword) {
        UsePassword = usePassword;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Date getBrithDay() {
        return BrithDay;
    }

    public void setBrithDay(Date brithDay) {
        BrithDay = brithDay;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getStart_working() {
        return Start_working;
    }

    public void setStart_working(String start_working) {
        Start_working = start_working;
    }
}
