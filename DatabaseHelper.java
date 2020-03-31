package com.example.gt.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
//two methods of sqliteopenhelper(to create and manage sqlite db) are oncreate and upgrade
public class DatabaseHelper extends SQLiteOpenHelper {
    //defining db name
    public static final String DATABASE_NAME = "Student.db";
    //defining tbl name
    public static final String TABLE_NAME = "student_table";
    //defining colums
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "GUARDIAN_NAME";
    public static final String COL_4 = "CNIC";
    public static final String COL_5 = "PROGRAM";
    public static final String COL_6 = "ADDRESS";
    public static final String COL_7 = "EMAIL";
    public static final String COL_8= "PH_NO";
//default consructor
    public DatabaseHelper(@Nullable  Context context) {
        //whenever this constructor is called db will be created
        super(context, DATABASE_NAME , null ,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creating tbl whenever oncreate method s called
        //db is varaible of sqlitedb
        //exeSQL :executes query ,it executes whatevr you passed this method as parameter(string query)
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,GUARDIAN_NAME TEXT,CNIC INTEGER,PROGRAM TEXT,ADDRESS TEXT,EMAIL TEXT,PH_NO INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String name,String guardian,String cnic,String program,String address,String email,String phno) {
     //this line only shows created  tables n db
        SQLiteDatabase db = this.getWritableDatabase();
        //instance of class content value
        ContentValues contentValues = new ContentValues();
        //entered vale in edit text has been passed here as an param in this method,so now inserting user's inserted data in tables's columns
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,guardian);
        contentValues.put(COL_4,cnic);
        contentValues.put(COL_5,program);
        contentValues.put(COL_6,address);
        contentValues.put(COL_7,email);
        contentValues.put(COL_8,phno);
        //now insert data using db instance
        long result = db.insert(TABLE_NAME,null ,contentValues);
        //if therre is any error in inserting data this method will return -1
        if(result == -1)
            return false;
        else
            //if successfully inserted data ,thn it returns inserted row
            return true;
    }
}
