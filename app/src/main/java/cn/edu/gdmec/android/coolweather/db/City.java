package cn.edu.gdmec.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HP on 2018/5/21.
 */

public class City extends DataSupport{
    private int id;
    private int citycode;
    private String cityName;
    private int pricienveId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPricienveId(int pricienveId) {
        this.pricienveId = pricienveId;
    }

    public int getId() {
        return id;
    }

    public int getCitycode() {
        return citycode;
    }

    public String getCityName() {
        return cityName;
    }

    public int getPricienveId() {
        return pricienveId;
    }
}
