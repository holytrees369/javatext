package com.holy.java.thread.initialization;

/**
 * @author YongTao
 * @create 2020-12-17 17 : 12
 */
public class TestRunnable implements Runnable {
    int number = 20;
    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println("Runnable实现类："+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.run();
        int number = 20;
        for (int i = 0; i < number; i++) {
            System.out.println("main:"+Thread.currentThread().getName());
        }
    }
}
