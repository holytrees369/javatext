package com.holy.java.thread.initialization;

/**
 * @author YongTao
 * @create 2020-12-17 17 : 12
 *
 * 创建方式一，继承Thread类,重写run方法,调用start方法开启线程
 */
public class TestThread extends Thread{
    int number = 20;
    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println("线程执行了："+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
        int number = 20;
        //main线程 主线程
        for (int i = 0; i < number; i++) {
            System.out.println("主线程执行了："+Thread.currentThread().getName());
        }
        System.out.println(30000/365);

    }
}
