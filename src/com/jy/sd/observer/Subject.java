package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/22/19 11:27 AM
 */
public interface Subject {
    /**
     * zhuce
     * @param observer
     */
     void registerObserver(Observer observer);

    /**
     * 移除
     * @param observer
     */
     void remove(Observer observer);

    /**
     * 通知
     */
     void notifyObservers();
}
