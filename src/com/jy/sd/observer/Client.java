package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/22/19 11:39 AM
 */
public class Client {

    public static void main(String[] args) {
        //天气对象
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();
        BaiduSite baiduSite = new BaiduSite();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiduSite);

        weatherData.setData(10L, 10L, 10L);
        weatherData.dataChange();
    }


}
