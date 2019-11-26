package com.jy.sd.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinxingjia
 * 11/22/19 11:31 AM
 */

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void dataChange() {
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(t -> {
            t.update(this.temperature, this.pressure, this.humidity);
        });
    }
}
