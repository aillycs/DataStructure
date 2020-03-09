package ailly.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyRunnable implements Runnable {

  @Override
  public void run() {
    System.out.println("I am a runnable thread: " + Thread.currentThread().getName());
  }

  public static void main(String[] args) {
    MyRunnable instance = new MyRunnable();
    Thread thread1 = new Thread(instance);
    thread1.start();

    ExecutorService executorService = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++) {
      executorService.submit(instance);
    }
    executorService.shutdown();
  }
}
