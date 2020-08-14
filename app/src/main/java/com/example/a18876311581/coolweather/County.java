package com.example.a18876311581.coolweather;

/**
 * Created by 18876311581 on 2020/8/14.
 */

public class County {
    private int id;
    private String countyName;//县名字
    private String weatherId;//县所对应的天气id
    private int cityId;//当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
