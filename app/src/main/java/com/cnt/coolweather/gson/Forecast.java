package com.cnt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/5.
 */

public class Forecast {
    public String date;

    public class Temperature{
        public String max;
        public String min;
    }
    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}
