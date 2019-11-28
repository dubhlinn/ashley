package cn.monolog.dubhlinn.ashley.concurrent.thread;

/**
 * 验证线程执行顺序
 * @author dubhlinn
 * @date 2019-11-25
 */
public class Demo1 {

    /**
     * 主方法、测试入口
     * @param args
     */
    public static void main(String[] args) {
        //新建线程
        Thread t = new Thread() {
            @Override
            public void run() {
                pong();
            }
        };
        //启动线程
        t.start();
        //在主线程中打印
        System.out.print("ping");
    }

    /**
     * 打印pong
     */
    private static void pong() {
        System.out.print("pong");
    }
}
