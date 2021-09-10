package org.example.mybatis.entity;

import java.io.Serializable;

/**
 * (Area)实体类
 *
 * @author makejava
 * @since 2021-09-10 22:07:16
 */
public class Area implements Serializable {
    private static final long serialVersionUID = 616522795513800743L;
    /**
     * 区域ID
     */
    private Long id;
    /**
     * 上级区域ID
     */
    private Long parentId;
    /**
     * 行政区域等级 1-省 2-市 3-区县 4-街道镇
     */
    private Integer level;
    /**
     * 名称
     */
    private String name;
    /**
     * 完整名称
     */
    private String wholeName;
    /**
     * 本区域经度
     */
    private String lon;
    /**
     * 本区域维度
     */
    private String lat;
    /**
     * 电话区号
     */
    private String cityCode;
    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 行政区划代码
     */
    private String areaCode;
    /**
     * 名称全拼
     */
    private String pinYin;
    /**
     * 首字母简拼
     */
    private String simplePy;
    /**
     * 区域名称拼音的第一个字母
     */
    private String perPinYin;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
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

