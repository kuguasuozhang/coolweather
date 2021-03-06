package com.example.a18876311581.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 18876311581 on 2020/8/14.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名字
    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
