package net.suool.suoolweather.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import net.suool.suoolweather.db.SuooLWeatherOpenHelper;

/**
 * Created by SuooL on 2014/10/3.
 */
public class SuooLWeatherDB {
    /**
     * 数据库名
     */
    public static final String DB_NAME = "suool_weather";

    /**
     * 数据库版本
     */
    public static final int VERSION = 1;

    private static SuooLWeatherDB suooLWeatherDB;
    private SQLiteDatabase db;

    /**
     * 构造方法私有化
     * @param context
     */
    private SuooLWeatherDB (Context context) {
        SuooLWeatherOpenHelper dbHelper = new SuooLWeatherOpenHelper(context,
                                            DB_NAME, null, VERSION);
        db = dbHelper.getWritableDatabase();
    }

}
