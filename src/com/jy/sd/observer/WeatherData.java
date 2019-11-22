package com.jy.sd.observer;

import java.util.List;

/**
 * @author jinxingjia
 * 11/22/19 11:31 AM
 */
public class WeatherData {

    private List<Observer> observers;

    public WeatherData(List<Observer> observers) {
        this.observers = observers;
    }


}
