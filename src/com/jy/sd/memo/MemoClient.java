package com.jy.sd.memo;

import java.time.LocalDateTime;

/**
 * @author jinxingjia
 * 11/27/19 11:53 AM
 */
public class MemoClient {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setId(1);
        originator.setMemoTime(LocalDateTime.now());
        originator.setName("备忘录1");
        originator.setState("状态1");

        caretaker.addMemo(originator.saveMemo());
        Memo memo = originator.getFromMemo(caretaker.getMemo(1));
        System.out.println(memo.getName()+memo.getMemoTime()+memo.getState());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Originator originator2 = new Originator();
        originator2.setId(2);
        originator2.setMemoTime(LocalDateTime.now());
        originator2.setName("备忘录2");
        originator2.setState("状态2");
        caretaker.addMemo(originator2.saveMemo());
        Memo memo2 = originator2.getFromMemo(caretaker.getMemo(2));
        System.out.println(memo2.getName()+memo2.getMemoTime()+memo2.getState());

    }


}
