package com.example.a18876311581.coolweather.db;

/**
 * Created by 18876311581 on 2020/8/14.
 */

public class City {
    private int id;
    private String cityName;//市名字
    private int cityCode;//市代号
    private int provinceId;//当市所属省id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}