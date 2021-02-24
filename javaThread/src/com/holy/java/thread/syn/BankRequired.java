package com.holy.java.thread.syn;

/**
 * @author YongTao
 * @create 2020-12-18 10 : 12
 *
 * 不安全的取钱
 * 两个人去银行取钱，账户
 */
public class BankRequired {
    Account account = new Account(100,"基金");

}

/**
 * 账户
 */
class Account{
    public Account(Integer money, String name) {
        this.money = money;
        this.name = name;
    }

    Integer money;
    String name;
}

/**
 * 银行:模拟取款
 */
class Bank extends Thread{

    public Bank(Account account, Integer drawingMoney, String name) {
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    Account account;
    Integer drawingMoney;
    Integer nowMoney;

    /**
     * 取钱
     */
    @Override
    public void run() {
        //判断有没有钱
        if (account.money - drawingMoney<0){
            System.out.println(Thread.currentThread().getName());
            return;
        }

        //卡内余额
        account.money = account.money - drawingMoney;

        //手里的钱
        nowMoney = nowMoney + drawingMoney;

        System.out.println(account.name+"余额为："+account.money);

        System.out.println(Thread.currentThread().getName()+"手里的钱"+nowMoney);
    }
}