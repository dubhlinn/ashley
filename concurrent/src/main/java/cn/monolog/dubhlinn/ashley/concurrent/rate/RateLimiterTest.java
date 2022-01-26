package cn.monolog.dubhlinn.ashley.concurrent.rate;

import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname 限流
 * @Description
 * @Author dubhlinn
 * @Date 2022-01-25
 */
@Slf4j
public class RateLimiterTest {
    /**
     * 线程数量
     */
    private static final int THREAD_NUM = 30;
    /**
     * 限速指标：每秒几个
     */
    private static final double RATE = 6;

    @Test
    @SuppressWarnings("all")
    public void test() {
        //定义线程池
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_NUM);

        //定义限速器
        RateLimiter rateLimiter = RateLimiter.create(RATE);

        // 开启循环
        for (int i = 0 ; i < THREAD_NUM ; i++) {
            //执行限速
            rateLimiter.acquire();

            //执行任务
            executorService.submit(new MyThread());
        }
    }

    /**
     * 自定义线程
     */
    private static class MyThread extends Thread {
        /**
         * 线程的内容
         */
        @Override
        public void run() {
            //子线程运行日志
            System.out.println("[print]" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        }
    }
}
