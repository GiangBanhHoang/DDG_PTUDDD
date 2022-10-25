package com.example.ddg_vip.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.ddg_vip.model.Register;
import com.example.ddg_vip.model.Room;

public class RoomDao {
        private SQLiteDatabase db;

        public RoomDao(Context context) {
            DBHelper helper = new DBHelper(context);
            this.db = helper.getWritableDatabase();
        }

        public long insert(Room emp) {
            ContentValues values = new ContentValues();
            values.put("id", emp.getId());
            values.put("name", emp.getName());
            values.put("user", emp.getAppUserId());

            return db.insert("User", null, values);

        }
}
