package com.lottery.utils;

import com.lottery.bean.Numbers;
import com.lottery.bean.PrizeLevel;

public interface CashPrize {

    /**
     * 计算奖金
     * @param prizeLevel
     */
    void calBonus(PrizeLevel prizeLevel);

    /**
     * 计算获奖等级
      * @param numbers1
     * @param numbers2
     */
    void calPrizeLevel(Numbers numbers1, Numbers numbers2);
}
