package cn.monolog.dubhlinn.ashley.design.mode.single;

import org.junit.Test;

/**
 * 测试类
 * @author dubhlinn
 * @date 2020-01-09
 */
public class Main {

	/**
	 * 测试并发情况下访问懒汉模式
	 * 可能出现线程不安全的情况
	 * 即线程分别新建了实例，与单例模式相违背
	 */
	@Test
	public void test1() {
		//定义线程
		Runnable r = new Runnable() {
			@Override
			public void run() {
				LazySingleton instance = LazySingleton.getInstance();
				System.out.println(instance);
			}
		};

		//新建三个线程实例
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);

		//主线程睡眠
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//启动三个线程
		t1.start();
		t2.start();
		t3.start();
	}
}
