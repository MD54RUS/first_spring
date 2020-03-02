package com.example.first_spring.weather.DTO;

public class Day {

    float maxTempC;
    float minTempC;
    float avgTempC;
    float maxWindKPH;
    float totalprecip_mm;
    float totalprecip_in;
    float avgvis_km;
    float avghumidity;
    Condition ConditionObject;

    public float getMaxTempC() {
        return maxTempC;
    }

    public void setMaxTempC(float maxTempC) {
        this.maxTempC = maxTempC;
    }

    public float getMinTempC() {
        return minTempC;
    }

    public void setMinTempC(float minTempC) {
        this.minTempC = minTempC;
    }

    public float getAvgTempC() {
        return avgTempC;
    }

    public void setAvgTempC(float avgTempC) {
        this.avgTempC = avgTempC;
    }

    public float getMaxWindKPH() {
        return maxWindKPH;
    }

    public void setMaxWindKPH(float maxWindKPH) {
        this.maxWindKPH = maxWindKPH;
    }

    public float getTotalprecip_mm() {
        return totalprecip_mm;
    }

    public void setTotalprecip_mm(float totalprecip_mm) {
        this.totalprecip_mm = totalprecip_mm;
    }

    public float getTotalprecip_in() {
        return totalprecip_in;
    }

    public void setTotalprecip_in(float totalprecip_in) {
        this.totalprecip_in = totalprecip_in;
    }

    public float getAvgvis_km() {
        return avgvis_km;
    }

    public void setAvgvis_km(float avgvis_km) {
        this.avgvis_km = avgvis_km;
    }

    public float getAvghumidity() {
        return avghumidity;
    }

    public void setAvghumidity(float avghumidity) {
        this.avghumidity = avghumidity;
    }

    public Condition getConditionObject() {
        return ConditionObject;
    }

    public void setConditionObject(Condition conditionObject) {
        ConditionObject = conditionObject;
    }

    public float getUv() {
        return uv;
    }

    public void setUv(float uv) {
        this.uv = uv;
    }

    float uv;

}
