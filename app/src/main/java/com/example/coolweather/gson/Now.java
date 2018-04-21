package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 电话微波炉 on 2018/4/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
