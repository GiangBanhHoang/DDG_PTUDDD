package com.example.ddg_vip.sqllite;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.class_DDG.Contact;

public class ContactDao {
    private SQLiteDatabase db;

    public ContactDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Contact emp){
        ContentValues values = new ContentValues();
        values.put("contact",emp.getContactId());
        values.put("user",emp.getAppUserId());
        values.put("hoten",emp.getHoTen());
        values.put("email",emp.getEmail().getNodeValue());
        values.put("sdt",emp.getSDT());
        values.put("title",emp.getTitle());
        values.put("content",emp.getContent().getNodeValue());
        values.put("time",emp.getTime().getTime());

        return db.insert("User",null,values);
    }
}
