package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/22/19 11:38 AM
 */
public class CurrentConditions implements Observer {
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
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }
}
