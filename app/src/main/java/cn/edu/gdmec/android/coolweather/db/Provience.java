package cn.edu.gdmec.android.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HP on 2018/5/21.
 */

public class Provience extends DataSupport{
    private int id;
    private String provienceName;
    private int provienceCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvienceName(String provienceName) {
        this.provienceName = provienceName;
    }

    public void setProvienceCode(int provienceCode) {
        this.provienceCode = provienceCode;
    }

    public int getId() {
        return id;
    }

    public String getProvienceName() {
        return provienceName;
    }

    public int getProvienceCode() {
        return provienceCode;
    }
}
