package com.example.ddg_vip.sqllite;

import java.util.Date;

public class UserDao {
     public Integer Id_User;
     public String User_Name;
     public String Address;
     public String Use_Password;
     public String Full_Name;
     public Date BrithDay;
     public String Gender;
     public String Mail;
     public String Phone;
     public String Role;
     public String Qualification;
     public Integer Salary;
     public String Startworking;

    public UserDao(Integer id_User, String user_Name, String address, String use_Password,
                   String full_Name, Date brithDay, String gender, String mail, String phone,
                   String role, String qualification, Integer salary, String startworking) {
        Id_User = id_User;
        User_Name = user_Name;
        Address = address;
        Use_Password = use_Password;
        Full_Name = full_Name;
        BrithDay = brithDay;
        Gender = gender;
        Mail = mail;
        Phone = phone;
        Role = role;
        Qualification = qualification;
        Salary = salary;
        Startworking = startworking;
    }
}
