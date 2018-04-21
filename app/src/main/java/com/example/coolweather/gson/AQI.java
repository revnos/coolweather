package com.example.coolweather.gson;

/**
 * Created by 电话微波炉 on 2018/4/21.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
