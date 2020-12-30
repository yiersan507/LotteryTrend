package com.lottery.bean;

import java.util.List;

public class Numbers {
    /**
     * 前区
     */
    private List<String> forwordNumbers;
    /**
     * 后区
     */
    private List<String> backwordNumbers;

    public void Numbers(List<String> forwordNumbers,List<String> backwordNumbers) {
        this.forwordNumbers = forwordNumbers;
        this.backwordNumbers = backwordNumbers;
    }

}
