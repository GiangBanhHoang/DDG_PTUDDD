package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.class_DDG.Topic;

public class TopicDao {
    private SQLiteDatabase db;

    public TopicDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Topic emp){
        ContentValues values = new ContentValues();
        values.put("idtopic",emp.getTopicId());
        values.put("name",emp.getTopicName());

        return db.insert("User",null,values);
    }
}
