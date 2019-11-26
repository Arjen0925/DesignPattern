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
    public void registerObserver(Observer observer);

    /**
     * 移除
     * @param observer
     */
    public void remove(Observer observer);

    /**
     * 通知
     */
    public void notifyObservers();
}
