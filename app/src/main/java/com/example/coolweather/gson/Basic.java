package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 电话微波炉 on 2018/4/21.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
