package com.example.ddg_vip.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DB_Name ="QuanLyKhoaHoc";
    public  static final int DB_VERSION=1;

    public DBHelper(Context context) {
        super(context, DB_Name, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String userSql = "CREATE TABLE IF NOT EXISTS User(Id_User INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "UserName NVARCHAR(100),Address NVARCHAR(300), UsePassword NVARCHAR(50),FullName NVARCHAR(100)," +
                "BrithDay DATETIME, Gender NVARCHAR(10), Mail NVARCHAR(50), Phone NVARCHAR(10), Role NVARCHAR(20)," +
                "Qualification NVARCHAR(10), Salary FLOAT, Startworking DATETIME)";
        String CommentSql = "CREATE TABLE IF NOT EXISTS Comment(CmtId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "UserId INTEGER,CourseId INTEGER, Content NVARCHAR(300), Evaluate FLOAT)";
        sqLiteDatabase.execSQL(userSql);
        sqLiteDatabase.execSQL(CommentSql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS Comment";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}

