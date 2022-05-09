package com.ling.juc.nolock;

public interface Account {

    /**
     * 获取金额
     * @return
     */
    Integer getBalance();

    /**
     * 扣除金额
     * @param amount
     */
    void withDraw(Integer amount);
}
