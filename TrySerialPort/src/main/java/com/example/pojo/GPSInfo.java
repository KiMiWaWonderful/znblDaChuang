package com.example.pojo;

import java.math.BigDecimal;

public class GPSInfo {

   private char location_status;  //(2) 定位状态，A=有效定位，V=无效定位

    private BigDecimal latitude; //(3) 纬度 ddmm.mmmmm（度分）
    private int latitudeDegree; //纬度的度
    private int latitudeCent; //纬度的分
    private int latitudeSecond; //纬度的秒
    private BigDecimal lat; //精确的纬度

    private  char NS; //(4) 纬度半球 N（北半球）或 S（南半球）

    private BigDecimal longitude;   //(5) 经度 dddmm.mmmmm（度分）
    private int longitudeDegree; //经度的度
    private  int longitudeCent; //经度的分
    private int longitudeSecond; //经度的秒
    private BigDecimal lng; //精确的经度


    private char EW;  //(6) 经度半球 E（东经）或 W（西经）
    private BigDecimal speed;    //(7) 地面速率（000.0~999.9 节）
    private  BigDecimal direction;    //(8) 地面航向（000.0~359.9 度，以真北方为参考基准）

    private BigDecimal baiduLat;
    private BigDecimal baiduLng;

    public GPSInfo(char location_status, BigDecimal latitude, char NS, BigDecimal longitude, char EW, BigDecimal speed, BigDecimal direction) {
        this.location_status = location_status;
        this.latitude = latitude;
        this.NS = NS;
        this.longitude = longitude;
        this.EW = EW;
        this.speed = speed;
        this.direction = direction;
    }

    public GPSInfo() {
    }

    public GPSInfo(String string) {
        GPSInfo gpsInfo = new GPSInfo();

        BigDecimal lati_cent_tmp;
        BigDecimal lati_second_tmp;
        BigDecimal long_cent_tmp;
        BigDecimal long_second_tmp;
        BigDecimal speed_tmp;


        //得到数组
        String[] strings = string.split(",");

        //获取定位状态，将string转为char
        gpsInfo.setLocation_status(strings[2].charAt(0));

        //纬度
        gpsInfo.setLatitude(new BigDecimal(strings[3]));


        //纬度的度(似乎不可用）
        gpsInfo.setLatitudeDegree(Integer.parseInt(String.valueOf(gpsInfo.getLatitude().divide(new BigDecimal(100)))));


        //纬度的分
        BigDecimal temp = gpsInfo.getLatitude().multiply(new BigDecimal(100));
        lati_cent_tmp = gpsInfo.getLatitude().subtract(temp);
        gpsInfo.setLatitudeCent(Integer.parseInt(String.valueOf(lati_cent_tmp)));
       // gpsInfo.getLatitude().subtract(gpsInfo.getLatitudeDegree())
       // gpsInfo.setLatitudeCent(gpsInfo.getLatitude().subtract(gpsInfo.getLatitudeDegree().multiply(new BigDecimal(100))));

        //纬度的秒
        lati_second_tmp = (lati_cent_tmp.subtract(BigDecimal.valueOf(gpsInfo.getLatitudeCent()))).multiply(new BigDecimal(60));
       gpsInfo.setLatitudeSecond(Integer.parseInt(String.valueOf(lati_second_tmp)));

       //得到精确的纬度
        gpsInfo.setLat(BigDecimal.valueOf(gpsInfo.getLatitudeDegree() + (gpsInfo.getLatitudeCent() + gpsInfo.getLatitudeSecond() / 60.0) / 60.0));

        //经度
        gpsInfo.setLongitude(new BigDecimal(strings[5]));

        //经度的度
        gpsInfo.setLongitudeDegree(Integer.parseInt(String.valueOf(gpsInfo.getLongitude().divide(new BigDecimal(100)))));

        //经度的分
        BigDecimal temp1 = gpsInfo.getLongitude().multiply(new BigDecimal(100));
        long_cent_tmp = gpsInfo.getLongitude().subtract(temp1);
        gpsInfo.setLongitudeCent(Integer.parseInt(String.valueOf(long_cent_tmp)));

        //经度的秒
        long_second_tmp = (long_cent_tmp.subtract(BigDecimal.valueOf(gpsInfo.getLongitudeCent()))).multiply(new BigDecimal(60));
        gpsInfo.setLongitudeSecond(Integer.parseInt(String.valueOf(long_second_tmp)));

        //得到精确的经度
        gpsInfo.setLng(BigDecimal.valueOf(gpsInfo.getLongitudeDegree() + (gpsInfo.getLongitudeCent() + gpsInfo.getLongitudeSecond() / 60.0) / 60.0));

        //速度
        speed_tmp = new BigDecimal(strings[7]);

        //得到精确的速度
        gpsInfo.setSpeed(speed_tmp.multiply(new BigDecimal(1.852)));

        //方向
        gpsInfo.setDirection(new BigDecimal(strings[8]));

        //gpsInfo.setLatitudeSecond();




    }

    public int getLatitudeDegree() {
        return latitudeDegree;
    }

    public void setLatitudeDegree(int latitudeDegree) {
        this.latitudeDegree = latitudeDegree;
    }

    public int getLatitudeCent() {
        return latitudeCent;
    }

    public void setLatitudeCent(int latitudeCent) {
        this.latitudeCent = latitudeCent;
    }

    public int getLatitudeSecond() {
        return latitudeSecond;
    }

    public void setLatitudeSecond(int latitudeSecond) {
        this.latitudeSecond = latitudeSecond;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public int getLongitudeDegree() {
        return longitudeDegree;
    }

    public void setLongitudeDegree(int longitudeDegree) {
        this.longitudeDegree = longitudeDegree;
    }

    public int getLongitudeCent() {
        return longitudeCent;
    }

    public void setLongitudeCent(int longitudeCent) {
        this.longitudeCent = longitudeCent;
    }

    public int getLongitudeSecond() {
        return longitudeSecond;
    }

    public void setLongitudeSecond(int longitudeSecond) {
        this.longitudeSecond = longitudeSecond;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public char getLocation_status() {
        return location_status;
    }

    public void setLocation_status(char location_status) {
        this.location_status = location_status;
    }


    public char getNS() {
        return NS;
    }

    public void setNS(char NS) {
        this.NS = NS;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        //latitude = new BigDecimal(strings[3]);
    }

//    public void setLatitude(String[] strings,BigDecimal latitude) {
//       // this.latitude = latitude;
//        latitude = new BigDecimal(strings[3]);
//    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
    }

    public char getEW() {
        return EW;
    }

    public void setEW(char EW) {
        this.EW = EW;
    }



}
