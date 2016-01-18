package com.monroeg.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by MonroeG on 2016/1/13.
 */
public class Crime {

    /**
     * UUID变量
     * String变量
     * Date变量表示crime发生的时间
     * Boolean变量表示crime是否已得到处理
     */
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date Date) {
        this.mDate = Date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean Solved) {
        this.mSolved = Solved;
    }
}
