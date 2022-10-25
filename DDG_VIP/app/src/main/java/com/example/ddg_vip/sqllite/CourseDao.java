package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Course;

public class CourseDao {
    private SQLiteDatabase db;

    public CourseDao(Context context) {
        DBHelper helper = new DBHelper(context);
        this.db = helper.getWritableDatabase();
    }

    public long insert(Course emp){
        ContentValues values = new ContentValues();
        values.put("course",emp.getCourseId());
        values.put("coursename",emp.getCourseName());
        values.put("discription",emp.getDiscription());
        values.put("price",emp.getPrice());
        values.put("originalprice",emp.getOriginalPrice());
        values.put("imgcourse",emp.getImgCourse().getNodeValue());
        values.put("totaltime",emp.getTotalTime());
        values.put("rating",emp.getRating());
        values.put("totalstudent",emp.getTotalStudent());
        values.put("topic",emp.getTopicId());
        values.put("discount",emp.getDiscountId());

        return db.insert("User",null,values);
    }
}
