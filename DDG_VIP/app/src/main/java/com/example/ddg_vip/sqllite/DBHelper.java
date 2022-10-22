package com.example.ddg_vip.sqllite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.sql.Time;

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

        String ReceiptSql = "CREATE TABLE IF NOT EXISTS Receipt(receiptId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "totalPrice FLOAT,timeReceipt DATE, registerId INTEGER)";

        String RegisterSql = "CREATE TABLE IF NOT EXISTS Register(registerId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "timeReg INTEGER,userId INTEGER, courseId INTEGER)";

        String CourseSql = "CREATE TABLE IF NOT EXISTS Course(courseId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "courseName NVARCHAR(100),discription NVACHAR(100), price INTEGER," +
                "originalPrice INTEGER, imgCourse TEXT, totalTime NVARCHAR(100), rating INTEGER," +
                "totalStudent INTEGER, topicId INTEGER, discountId INTEGER)";

        String TopicSql = "CREATE TABLE IF NOT EXISTS Topic(topicId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "topicName NVARCHAR(50))";

        String DisCountSql = "CREATE TABLE IF NOT EXISTS DisCount(discountId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "discription NVARCHAR(50), time DATETIME,sale FLOAT )";

        String LessonSql = "CREATE TABLE IF NOT EXISTS Lesson(lessonId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "title NVARCHAR(50), description TEXT,content NVARCHAR(50),link TEXT," +
                "captionLink NVARCHAR(100), courseId INTEGER)";

        String Exercise_has_UserSql = "CREATE TABLE IF NOT EXISTS Course(exerciseId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "userId INTEGER,content TEXT, status NVARCHAR(200),submit DATETIME,scores FLOAT)";

        String ContactSql = "CREATE TABLE IF NOT EXISTS Contact(contactId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "userId INTEGER,HoTen NVARCHAR(100), email TEXT,SDT NVARCHAR(10),title NVARCHAR(50),time DATETIME )";

        String ExerciseSql = "CREATE TABLE IF NOT EXISTS Exercise(exerciseId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "content NVARCHAR(100),input NVARCHAR(10),output NVARCHAR(10),deadline DATETIME, " +
                "lessonId INTEGER, userId INTEGER)";

        String MassengeSql = "CREATE TABLE IF NOT EXISTS Massage(masageId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Content NVARCHAR(10), Timestamp DATETIME, RoomId INTEGER, userId INTEGER)";

        String RoomSql = "CREATE TABLE IF NOT EXISTS Room(roomId INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "Name NVARCHAR(10), userId INTEGER)";

        sqLiteDatabase.execSQL(userSql);
        sqLiteDatabase.execSQL(CommentSql);
        sqLiteDatabase.execSQL(ReceiptSql);
        sqLiteDatabase.execSQL(RegisterSql);
        sqLiteDatabase.execSQL(CourseSql);
        sqLiteDatabase.execSQL(TopicSql);
        sqLiteDatabase.execSQL(DisCountSql);
        sqLiteDatabase.execSQL(LessonSql);
        sqLiteDatabase.execSQL(Exercise_has_UserSql);
        sqLiteDatabase.execSQL(ContactSql);
        sqLiteDatabase.execSQL(ExerciseSql);
        sqLiteDatabase.execSQL(MassengeSql);
        sqLiteDatabase.execSQL(RoomSql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS Comment";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}

