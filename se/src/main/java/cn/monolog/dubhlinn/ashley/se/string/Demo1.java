package cn.monolog.dubhlinn.ashley.se.string;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * 验证String、StringBuilder、StringBuffer
 * @author dubhlinn
 * @date 2019-11-25
 */
public class Demo1 {

    /**
     * 使用StringBuilder对字符串进行批量操作
     * 在并发情况下可能导致线程不安全
     */
    @Test
    public void test1() {
        //新建字符串
        String str = new String("luis");
        //新建字符串生成器
        StringBuilder stringBuilder = new StringBuilder(str);
        //设置线程计数
        CountDownLatch countDownLatch = new CountDownLatch(2);
        //新开子线程，对字符串生成器加0
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++) {
                    stringBuilder.append(0);
                }
                countDownLatch.countDown();
            }
        };
        //新开子线程，对字符串生成器加1
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++) {
                    stringBuilder.append(1);
                }
                countDownLatch.countDown();
            }
        };
        //启动子线程
        t1.start();
        t2.start();
        //让主线程等待子线程结束
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //重新生成字符串
        str = stringBuilder.toString();
        //打印字符串长度，并不是期望的20004
        System.out.println(str.length());
    }

    /**
     * 使用StringBuffer对字符串进行批量操作
     * 在并发的情况下也能保证线程安全，因为它的写操作方法都加了synchronized对象锁
     */
    @Test
    public void test2() {
        //新建字符串
        String str = new String("luis");
        //新建字符串生成器
        StringBuffer stringBuffer = new StringBuffer(str);
        //线程计数器
        CountDownLatch countDownLatch = new CountDownLatch(2);
        //新开子线程，对字符串生成器加0
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++) {
                    stringBuffer.append(0);
                }
                countDownLatch.countDown();
            }
        };
        //新开子线程，对字符串生成器加1
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++) {
                    stringBuffer.append(1);
                }
                countDownLatch.countDown();
            }
        };
        //启动子线程
        t1.start();
        t2.start();
        //主线程等待两个子线程都执行完毕
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //重新生成字符串
        str = stringBuffer.toString();
        //打印字符串长度，确实是期望的20004
        System.out.println(str.length());
    }
}
