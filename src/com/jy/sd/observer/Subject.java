package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/22/19 11:27 AM
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void remove(Observer observer);

    public void notifyObservers();
}
