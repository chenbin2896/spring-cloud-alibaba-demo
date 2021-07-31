package org.example.core.pojo;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "area")

public class Area implements Serializable {

    @Id
    private long id;
    private long parentId;
    private long level;
    private String name;
    private String wholeName;
    private String lon;
    private String lat;
    private String cityCode;
    private String zipCode;
    private String areaCode;
    private String pinYin;
    private String simplePy;
    private String perPinYin;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }


    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getWholeName() {
        return wholeName;
    }

    public void setWholeName(String wholeName) {
        this.wholeName = wholeName;
    }


    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }


    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }


    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }


    public String getPinYin() {
        return pinYin;
    }

    public void setPinYin(String pinYin) {
        this.pinYin = pinYin;
    }


    public String getSimplePy() {
        return simplePy;
    }

    public void setSimplePy(String simplePy) {
        this.simplePy = simplePy;
    }


    public String getPerPinYin() {
        return perPinYin;
    }

    public void setPerPinYin(String perPinYin) {
        this.perPinYin = perPinYin;
    }

}
