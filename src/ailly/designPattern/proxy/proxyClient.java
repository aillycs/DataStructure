package ailly.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class proxyClient {

  public static void main(String[] args) {
    Service service = new ServiceImpl();
    Service proxy = proxyClient.getClient(service);
    proxy.show();
    new StringBuffer();
  }

  private static Service getClient(Service service) {
    ClassLoader classLoader = service.getClass().getClassLoader();
    Class<?>[] classes = service.getClass().getInterfaces();
    InvocationHandler invocationHandler = (proxy, method, args) -> {
      System.out.println("before method");
      Object res = method.invoke(service, args);
      System.out.println("after method");
      return res;
    };

    Object proxy = Proxy.newProxyInstance(classLoader, classes, invocationHandler);

    return (Service) proxy;
  }
}
