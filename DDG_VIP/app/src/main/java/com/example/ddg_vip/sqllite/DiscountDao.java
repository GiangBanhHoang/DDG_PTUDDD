package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Discount;

public class DiscountDao {
    private SQLiteDatabase db;

    public DiscountDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Discount emp){
        ContentValues values = new ContentValues();
        values.put("discount",emp.getDiscountId());
        values.put("discription",emp.getDiscription());
        values.put("time",emp.getTime().getTime());
        values.put("sale",emp.getSale());

        return db.insert("User",null,values);
    }
}
