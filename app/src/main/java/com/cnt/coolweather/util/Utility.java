package com.cnt.coolweather.util;

import android.text.TextUtils;

import com.cnt.coolweather.db.City;
import com.cnt.coolweather.db.County;
import com.cnt.coolweather.db.Provice;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/10/31.
 */

public class Utility {
    public  static  boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces = new JSONArray(response);
                for(int i = 0;i<allProvinces.length();i++){
                    JSONObject province = allProvinces.getJSONObject(i);
                    Provice provice = new Provice();
                    provice.setProvinceName(province.getString("name"));
                    provice.setProvinceCode(province.getInt("id"));
                    provice.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return  false;
    }

    public static  boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray cityjsonArray = new JSONArray(response);
                for(int i = 0;i<cityjsonArray.length();i++){
                    JSONObject cityJsonObject = cityjsonArray.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityJsonObject.getString("name"));
                    city.setCityCode(cityJsonObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return  true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return  false;
    }

    public static  boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try{
            JSONArray allCounty = new JSONArray(response);
                for(int i = 0;i<allCounty.length();i++){
                    JSONObject countyObject = allCounty.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.save();
                }
                return true;
        }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

}
