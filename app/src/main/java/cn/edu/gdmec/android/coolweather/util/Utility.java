package cn.edu.gdmec.android.coolweather.util;

import android.app.ProgressDialog;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.edu.gdmec.android.coolweather.db.City;
import cn.edu.gdmec.android.coolweather.db.Country;
import cn.edu.gdmec.android.coolweather.db.Provience;

/**
 * Created by HP on 2018/5/21.
 */

public class Utility {
//    解析和处理服务器返回的省级数据
    public static boolean handlerProvienceResopnse(String response){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allProviences=new JSONArray(response);
                for (int i=0;i<allProviences.length();i++){
                    JSONObject provienceObject=allProviences.getJSONObject(i);
                    Provience provience=new Provience();
                    provience.setProvienceName(provienceObject.getString("name"));
                    provience.setProvienceCode(provienceObject.getInt("id"));
                    provience.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }
    //    解析和处理服务器返回的省级数据
    public static boolean handlerCityResopnse(String response,int provienceId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allcities=new JSONArray(response);
                for (int i=0;i<allcities.length();i++){
                    JSONObject cityObject=allcities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCitycode(cityObject.getInt("id"));
                    city.setPricienveId(provienceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }

    //    解析和处理服务器返回的县级数据
    public static boolean handlerCountryResopnse(String response,int cityId){
        if (!TextUtils.isEmpty(response)){
            try{
                JSONArray allCountries=new JSONArray(response);
                for (int i=0;i<allCountries.length();i++){
                    JSONObject countryObject=allCountries.getJSONObject(i);
                    Country country=new Country();
                    country.setCountryName(countryObject.getString("name"));
                    country.setWeatherId(countryObject.getString("weather_id"));
                    country.setCityId(cityId);
                    country.save();



                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }

        }
        return false;
    }
}
