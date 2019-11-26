package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/26/19 10:22 AM
 */
public class BaiduSite implements Observer {

    private float temperature;

    private float pressure;

    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("百度播报现在的温度是" + temperature);
        System.out.println("百度播报现在的湿度是" + humidity);
        System.out.println("百度播报现在的气压是" + pressure);
    }

}
