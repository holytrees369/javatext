package com.holy.java.thread;

/**
 * @author YongTao
 * @create 2020-12-23 10 : 12
 */
public class MyRunnable implements Runnable {
    private volatile boolean active;
    @Override
    public void run()
    {
        active = true;
        while (active) // 第一行
        {
            // 代码
            System.out.println(Thread.currentThread().getName());
        }
    }
    public void stop()
    {
        active = false; // 第二行
    }

    public static void main(String[] args) {
        MyRunnable one = new MyRunnable();
        one.run();
        one.stop();
    }
}
