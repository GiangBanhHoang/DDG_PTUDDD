package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Comment;

public class CommentDao {
    private SQLiteDatabase db;

    public CommentDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Comment emp){
        ContentValues values = new ContentValues();
        values.put("cmt",emp.getCmtId());
        values.put("user",emp.getUserId());
        values.put("course",emp.getCourseId());
        values.put("content",emp.getContent());
        values.put("evaluate",emp.getEvaluate());


        return db.insert("User",null,values);
    }
}
