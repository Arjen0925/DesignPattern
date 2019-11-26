package com.jy.sd.observer;

/**
 * @author jinxingjia
 * 11/22/19 11:26 AM
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);
}
