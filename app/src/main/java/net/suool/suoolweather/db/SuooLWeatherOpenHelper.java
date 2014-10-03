package net.suool.suoolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 省市县三级数据库创建
 * Created by SuooL on 2014/10/3.
 */
public class SuooLWeatherOpenHelper extends SQLiteOpenHelper {


    /**
     * province 建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";

    /**
     * City 建表语句
     *
     */
    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    /**
     * County 建表语句
     *
     */
    public static final String CREATE_COUNTY = "create table County ("
            + "id integer primary key autoincrement,"
            + "county_name text,"
            + "county_code text,"
            + "city_id integer";

    /**
     * 构造器
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public SuooLWeatherOpenHelper(Context context,
                                  String name,
                                  SQLiteDatabase.CursorFactory factory,
                                  int version) {
        super(context, name, factory, version);
    }

    /**
     *
     * @param db
     */

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 创建表
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    /**
     *
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // NULL
    }
}
