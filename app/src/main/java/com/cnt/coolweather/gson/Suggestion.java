package com.cnt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/5.
 */

public class Suggestion {
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("comf")
    public Comfort comfort;

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cw")
    public CarWash carWash;

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
    public Sport sport;
}
