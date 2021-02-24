package com.holy.java.thread.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author YongTao
 * @create 2020-12-18 10 : 12
 *
 * 测试线程池
 */
public class TestPools {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute( new MyThread());
        service.execute( new MyThread());
        service.execute( new MyThread());
        service.execute( new MyThread());

        service.shutdown();

    }

}
class MyThread implements Runnable{

    int number = 10;
    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
