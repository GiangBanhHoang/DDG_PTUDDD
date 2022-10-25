package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Exercise_has_User;

import org.w3c.dom.Text;

import java.util.Date;

public class Exercise_has_UserDao {
    private SQLiteDatabase db;

    public Exercise_has_UserDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Exercise_has_User emp){
        ContentValues values = new ContentValues();
        values.put("exercise",emp.getExerciseId());
        values.put("user",emp.getUserId());
        values.put("content",emp.getContent().getNodeValue());
        values.put("status",emp.getStatus());
        values.put("submit",emp.getSubmit().getTime());
        values.put("scores",emp.getScores());

        return db.insert("User",null,values);
    }
}
