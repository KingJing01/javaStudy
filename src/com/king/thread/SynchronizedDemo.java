package com.king.thread;
/**
* @Description: 起4个线程 2个线程做+1 2个线程做—1
* @Author: kingJing
* @Date: 2019/6/25 16:14
**/
public class SynchronizedDemo {
    private int j =0;

    public synchronized void increase() {
        j++;
        System.out.println(Thread.currentThread().getName()+"----add ---->"+j);
    }
    public synchronized void desc(){
        j--;
        System.out.println(Thread.currentThread().getName()+"----desc ---->"+j);
    }

    class IncreaseClass extends Thread {
        @Override
        public  void run(){
            increase();
        }
    }

    class DescClass implements Runnable  {
        @Override
        public  void run(){
            desc();
        }
    }

    public static void main(String args[]) {
        SynchronizedDemo synchronizedDemo = new SynchronizedDemo();
        IncreaseClass increaseClass =  synchronizedDemo.new IncreaseClass();
        DescClass descClass  = synchronizedDemo.new DescClass();
        for (int i = 0 ;i <2 ;i++) {
            Thread thread = new Thread(increaseClass);
            thread.start();
            Thread descThread = new Thread(descClass);
            descThread.start();
        }

    }
}
