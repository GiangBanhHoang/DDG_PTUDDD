package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.class_DDG.Receipt;

public class ReceiptDao {
    private SQLiteDatabase db;

    public ReceiptDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Receipt emp){
        ContentValues values = new ContentValues();
        values.put("idreciept",emp.getReceiptId());
        values.put("totalprice",emp.getTotalPrice());
        values.put("timereceipt",emp.getTimeReceipt().getTime());
        values.put("register",emp.getRegisterId());

        return db.insert("User",null,values);
    }
}
