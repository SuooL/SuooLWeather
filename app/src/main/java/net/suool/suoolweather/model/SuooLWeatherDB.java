package net.suool.suoolweather.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import net.suool.suoolweather.db.SuooLWeatherOpenHelper;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 获取 SuooLWeatherDB 实例
     * @param context
     * @return
     */
    public synchronized static SuooLWeatherDB getInstance (Context context) {
        if (suooLWeatherDB == null) {
            suooLWeatherDB = new SuooLWeatherDB(context);
        }
        return suooLWeatherDB;
    }

    /**
     * 将 Province 实例存储入数据库
     * @param province
     */
    public void saveProvince (Province province) {
        if (province != null) {
            ContentValues values = new ContentValues();
            values.put("Province_name", province.getProvinceName());
            values.put("Province_code", province.getProvinceCode());
            db.insert("Province", null, values);
        }
    }

    /**
     * 从数据库读取全国各省份信息
     *
     */
    public List<Province> loadProvince() {
        List<Province> list = new ArrayList<Province>();
        Cursor cursor = db.query("Province", null,
                                null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                Province province = new Province();
                province.setId(cursor.getInt(cursor.getColumnIndex("id")));
                province.setProvinceName(cursor.getString(cursor.getColumnIndex("province_name")));
                province.setProvinceCode(cursor.getString(cursor.getColumnIndex("province_code")));
                list.add(province);
            } while (cursor.moveToNext());
        }
        return list;
    }

    /**
     * 将City实例插入数据库
     * @param city
     */
    public void saveCity(City city) {
        if (city != null) {
            ContentValues values = new ContentValues();
            values.put("city_name", city.getCityName());
            values.put("city_code", city.getCityCode());
            values.put("province_id", city.getProvinceId());
            db.insert("City", null, values);
        }
    }

    /**
     * 从数据库读取某省下所有城市信息
     * @param provinceId
     * @return
     */
    public List<City> loadCities (int provinceId) {
        List<City> list = new ArrayList<City>();
        Cursor cursor = db.query("City", null, "province_id=?",
                new String[]{String.valueOf(provinceId)}, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                City city = new City();
                city.setId(cursor.getInt(cursor.getColumnIndex("id")));
                city.setCityName(cursor.getString(cursor.getColumnIndex("city_name")));
                city.setCityCode(cursor.getString(cursor.getColumnIndex("city_code")));
                city.setProvinceId(provinceId);
                list.add(city);
            } while (cursor.moveToNext());
        }
        return list;
    }

    /**
     * 将county实例存储到数据库
     * @param county
     */
    public void saveCounty (County county) {
        if (county != null) {
            ContentValues values = new ContentValues();
            values.put("county_name", county.getCountyName());
            values.put("county_code", county.getCountyCode());
            values.put("city_id", county.getCityId());
            db.insert("County", null, values);
        }
    }

    /**
     * 从数据库读取某城市下所有的县信息
     */
    public List<County> loadCounties (int cityId) {
        List<County> list = new ArrayList<County>();
        Cursor cursor = db.query("County", null, "city_id = ?",
                        new String[]{String.valueOf(cityId)},null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                County county = new County();
                county.setId(cursor.getInt(cursor.getColumnIndex("id")));
                county.setCountyName(cursor.getString(cursor.getColumnIndex("county_name")));
                county.setCountyCode(cursor.getString(cursor.getColumnIndex("county_code")));
                county.setId(cityId);
                list.add(county);
            } while (cursor.moveToNext());
        }
        return  list;
    }
    



}
