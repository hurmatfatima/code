package com.example.gt.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "GUARDIAN_NAME";
    public static final String COL_4 = "CNIC";
    public static final String COL_5 = "PROGRAM";
    public static final String COL_6 = "ADDRESS";
    public static final String COL_7 = "EMAIL";
    public static final String COL_8= "PH_NO";

    public DatabaseHelper(@Nullable  Context context) {
        super(context, DATABASE_NAME , null ,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,GUARDIAN_NAME TEXT,CNIC INTEGER,PROGRAM TEXT,ADDRESS TEXT,EMAIL TEXT,PH_NO INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String name,String guardian,String cnic,String program,String address,String email,String phno) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,guardian);
        contentValues.put(COL_4,cnic);
        contentValues.put(COL_5,program);
        contentValues.put(COL_6,address);
        contentValues.put(COL_7,email);
        contentValues.put(COL_8,phno);
        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
}
