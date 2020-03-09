package ailly.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable {

  @Override
  public Integer call() throws Exception {
    Thread.sleep(5000);
    return 100;
  }

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    MyCallable mc = new MyCallable();
    FutureTask<Integer> ft = new FutureTask<>(mc);
    Thread thread = new Thread(ft);
    thread.start();
    System.out.println(ft.get());

    ExecutorService executor = Executors.newCachedThreadPool();
    Future<Integer> result = executor.submit(mc);
    executor.shutdown();

    if (result.get() != null) {
      System.out.println("task运行结果: " + result.get());
    } else {
      System.out.println("未获取到结果");
    }
  }
}
