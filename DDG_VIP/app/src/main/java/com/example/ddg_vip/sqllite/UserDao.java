package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.class_DDG.User;

public class UserDao {
    private SQLiteDatabase db;

    public UserDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(User emp){
       ContentValues values = new ContentValues();
        values.put("iduser",emp.getIdUser());
        values.put("name",emp.getUserName());
        values.put("address",emp.getAddress());
        values.put("password",emp.getUsePassword());
        values.put("fullname",emp.getFullName());
        values.put("brithday",emp.getBrithDay().getTime());
        values.put("gender",emp.getGender());
        values.put("mail",emp.getMail());
        values.put("phone",emp.getPhone());
        values.put("role",emp.getRole());
        values.put("qualification",emp.getQualification());
        values.put("salary",emp.getSalary());
        values.put("startworking",emp.getStart_working());

       return db.insert("User",null,values);
    }
}
