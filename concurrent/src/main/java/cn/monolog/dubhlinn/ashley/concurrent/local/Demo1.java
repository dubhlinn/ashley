package cn.monolog.dubhlinn.ashley.concurrent.local;

import java.util.concurrent.CountDownLatch;

/**
 * @Classname 多个线程同时修改字符串
 * @Description threadLocal类的简单使用
 * @Author dubhlinn
 * @Date 2020-12-24
 */
public class Demo1 {
    /**
     * 普通成员变量
     */
    private static String VAL = "";

    /**
     * 线程隔离变量
     */
    private static final ThreadLocal<String> ISOLATED_VAL = ThreadLocal.withInitial(() -> "");

    /**
     * 打印
     */
    private static void print() {
        System.out.println("线程[" + Thread.currentThread().getName() + "] 普通变量 = " + VAL);
        System.out.println("线程[" + Thread.currentThread().getName() + "] 线程隔离变量 = " + ISOLATED_VAL.get());
    }

    /**
     * 主方法
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        //声明线程数量
        int threadNum = 100;

        //线程计数器
        CountDownLatch counter = new CountDownLatch(threadNum);

        //并发执行
        for (int i = 0 ; i < threadNum ; i++) {
            //新建线程
            Thread t = new Thread(() -> {
                //修改普通变量
                VAL += "i";
                //修改线程隔离变量
                String localVal = ISOLATED_VAL.get();
                ISOLATED_VAL.set(localVal + "i");
                //打印
                print();
            });
            try {
                //启动线程
                t.start();
            } finally {
                //更新计数器
                counter.countDown();
            }
        }

        //主线程等待
        counter.await();
    }
}
