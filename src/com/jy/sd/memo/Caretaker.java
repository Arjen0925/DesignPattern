package com.jy.sd.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinxingjia
 * 11/27/19 11:41 AM
 */
public class Caretaker {

    private List<Memo> memoList = new ArrayList<>();

    public Memo getMemo(Integer memoId) {

        for (Memo memo : memoList) {
           if(memoId.equals(memo.getId())){
               return memo;
           }
        }

        return null;
    }

    public void addMemo(Memo memo) {
        memoList.add(memo);
    }
}
