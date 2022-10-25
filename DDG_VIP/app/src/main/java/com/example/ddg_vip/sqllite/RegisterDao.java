package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Register;

public class RegisterDao {
    private SQLiteDatabase db;

    public RegisterDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Register emp){
        ContentValues values = new ContentValues();
        values.put("idregister",emp.getRegisterId());
        values.put("timereg",emp.getTimeReg());
        values.put("userid",emp.getUserId());
        values.put("couese",emp.getCourseId());

        return db.insert("User",null,values);
    }
}
