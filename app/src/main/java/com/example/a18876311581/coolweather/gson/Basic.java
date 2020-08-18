package com.example.a18876311581.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 18876311581 on 2020/8/15.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
