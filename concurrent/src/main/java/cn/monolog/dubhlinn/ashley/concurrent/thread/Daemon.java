package cn.monolog.dubhlinn.ashley.concurrent.thread;

import org.junit.Test;

/**
 * 验证用户线程和守护线程的区别
 * @author dubhlinn
 * @date 2019-11-30
 */
public class Daemon {

    /**
     * 用户线程，在主线程（或其他的用户线程）结束后仍然不会退出
     */
    @Test
    public void test1() {
        //新建一个用户线程
        Thread userThread = new Thread() {
            @Override
            public void run() {
                //每隔2秒钟打印一次日志
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("来自线程" + Thread.currentThread().getName() + "的问候");
                }
            }
        };
        //启动用户线程
        userThread.start();

        //在主线程中打印日志，打印5次
        for (int i=0 ; i<5 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("嘟嘟嘟");
        }
    }

    /**
     * 守护线程，在主线程（或其他的用户线程）结束后自动退出
     */
    @Test
    public void test2() {
        //新建一个守护线程
        Thread daemonThread = new Thread() {
            @Override
            public void run() {
                //每隔2秒钟打印一次日志
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("来自线程" + Thread.currentThread().getName() + "的问候");
                }
            }
        };
        //设置为守护线程
        daemonThread.setDaemon(true);
        //启动守护线程
        daemonThread.start();

        //在主线程中打印日志，打印5次
        for (int i=0 ; i<5 ; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("嘟嘟嘟");
        }
    }
}
