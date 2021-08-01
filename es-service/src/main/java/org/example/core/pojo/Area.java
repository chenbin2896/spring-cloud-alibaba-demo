package org.example.core.pojo;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

@Document(indexName = "area2",shards = 1,replicas = 0)
public class Area implements Serializable {

    @Id
    private long id;
    private long parentId;
    private long level;
    @Field(type = FieldType.Keyword)
    private String name;
    @Field(type = FieldType.Keyword)
    private String wholeName;
    private String lon;
    private String lat;
    @Field(type = FieldType.Keyword)
    private String cityCode;
    private String zipCode;
    private String areaCode;
    private String pinYin;
    private String simplePy;
    private String perPinYin;

    public Area() {
    }

    public Area(long id, long parentId, long level, String name, String wholeName, String lon, String lat, String cityCode, String zipCode, String areaCode, String pinYin, String simplePy, String perPinYin) {
        this.id = id;
        this.parentId = parentId;
        this.level = level;
        this.name = name;
        this.wholeName = wholeName;
        this.lon = lon;
        this.lat = lat;
        this.cityCode = cityCode;
        this.zipCode = zipCode;
        this.areaCode = areaCode;
        this.pinYin = pinYin;
        this.simplePy = simplePy;
        this.perPinYin = perPinYin;
    }

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
