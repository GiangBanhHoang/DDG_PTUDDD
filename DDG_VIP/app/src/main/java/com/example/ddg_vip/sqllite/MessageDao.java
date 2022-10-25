package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Message;


public class MessageDao {
        private SQLiteDatabase db;

        public MessageDao(Context context) {
            DBHelper helper = new DBHelper(context);
            this.db = helper.getWritableDatabase();
        }

        public long insert(Message emp){
            ContentValues values = new ContentValues();
            values.put("id",emp.getId());
            values.put("content",emp.getContent());
            values.put("timestamp",emp.getTimestamp().getTime());
            values.put("toroom",emp.getToRoomId());
            values.put("user",emp.getAppUserId());

            return db.insert("User",null,values);
        }
}
