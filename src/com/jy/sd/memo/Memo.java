package com.jy.sd.memo;

import java.time.LocalDateTime;

/**
 * @author jinxingjia
 * 11/27/19 11:23 AM
 */
public class Memo {

    private Integer id;

    private String name;

    private String state;

    private LocalDateTime memoTime;

    public Memo(Integer id, String name, String state, LocalDateTime memoTime) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.memoTime = memoTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getMemoTime() {
        return memoTime;
    }

    public void setMemoTime(LocalDateTime memoTime) {
        this.memoTime = memoTime;
    }
}
