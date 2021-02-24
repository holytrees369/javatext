package com.holy.java.thread.syn;

/**
 * @author YongTao
 * @create 2020-12-18 09 : 12
 *
 * 不安全的买票
 */
public class TicketPurchase {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"张三").start();
        new Thread(buyTicket,"李四").start();
        new Thread(buyTicket,"王五").start();
    }

}
class BuyTicket implements Runnable{

    /**
     * 票库存
     */
    private Integer tickets = 100;
    Boolean flag = true;

    @Override
    public void run() {
        while (flag){
            buy();
        }


    }
    private void buy(){
        if (0==tickets){
            flag = false;
            return ;
        }
        System.out.println(Thread.currentThread().getName()+"拿到"+tickets--);
    }
}
