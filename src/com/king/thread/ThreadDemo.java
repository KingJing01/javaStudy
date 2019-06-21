package com.king.thread;

/**
 * 线程demo练习
 * 
 * @author admin
 *
 */
public class ThreadDemo {

	public static void main(String arg[]) {
		// 创建Thread子类
		MyThread myThread = new MyThread();
		System.out.println(myThread.getName());
		myThread.start();
		// 实现runnable接口
		Thread thread = new Thread(new MyRunnable(), "testThread");
		System.out.println(thread.getName() + "即将进入 sleep");
		try {
			thread.sleep(100);
			System.out.println(thread.getName() + " sleep 结束");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.start();
	}
}
