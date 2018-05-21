package cn.edu.gdmec.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HP on 2018/5/21.
 * 县
 */

public class Country extends DataSupport {
    private int id;
    private String weatherId;
    private String countryName;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCityId() {
        return cityId;
    }
}
