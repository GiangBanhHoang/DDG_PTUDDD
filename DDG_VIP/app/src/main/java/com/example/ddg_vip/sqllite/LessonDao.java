package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Lesson;
import com.example.ddg_vip.model.User;

import org.w3c.dom.Text;

public class LessonDao {
    private SQLiteDatabase db;

    public LessonDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Lesson emp){
        ContentValues values = new ContentValues();
        values.put("idlesson",emp.getLessonId());
        values.put("title",emp.getTitle());
        values.put("desciption",emp.getDescription().getNodeValue());
        values.put("content",emp.getContent());
        values.put("link",emp.getLink().getNodeValue());
        values.put("captionlink",emp.getCaptionLink());
        values.put("course",emp.getCourseId());

        return db.insert("User",null,values);
    }
}
