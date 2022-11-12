package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.class_DDG.Exercise;

public class ExerciseDao {
    private SQLiteDatabase db;

    public ExerciseDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Exercise emp){
        ContentValues values = new ContentValues();
        values.put("exercise",emp.getExerciseId());
        values.put("exercisename",emp.getExerciseName());
        values.put("content",emp.getContent());
        values.put("input",emp.getInput());
        values.put("output",emp.getOutput());
        values.put("lesson",emp.getLessonId());
        values.put("user",emp.getUserId());

        return db.insert("User",null,values);
    }
 }
