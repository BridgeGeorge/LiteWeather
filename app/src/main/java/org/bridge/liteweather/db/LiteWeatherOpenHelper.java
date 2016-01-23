package org.bridge.liteweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import org.bridge.liteweather.util.LogUtil;

/**
 * 数据库管理类
 */

public class LiteWeatherOpenHelper extends SQLiteOpenHelper {
    public LiteWeatherOpenHelper(Context context, String name,
                                 CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * Province 表建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement," + "province_name text,"
            + "province_code text)";
    /**
     * City表建表语句
     */
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement," + "city_name text,"
            + "city_code text," + "province_id integer)";
    /**
     * County 表建表语句
     */
    public static final String CREATE_COUNTY = "create table County("
            + "id integer primary key autoincrement," + "county_name text,"
            + "county_code text," + "city_id integer)";

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 分别创建三个表
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
        LogUtil.d("database", "created successfully");
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }

}
