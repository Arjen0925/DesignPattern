package com.jy.sd.memo;

import java.time.LocalDateTime;

/**
 * @author jinxingjia
 * 11/27/19 11:28 AM
 */

public class Originator {

    private Integer id;

    private String name;

    private String state;

    private LocalDateTime memoTime;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 保存备忘录
     * @return
     */
    public Memo saveMemo() {
        return new Memo(id,name,state,memoTime);
    }

    /**
     * 从备忘录里取出来
     * @param memo
     * @return
     */

    public Memo getFromMemo(Memo memo) {
        return memo;
    }
}
