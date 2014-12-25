package example;

import study.Server;

import javax.xml.namespace.QName;

/**
 * Created by !5<Q= on 26.12.2014.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
      study.Server service = new study.ServerService().getServerPort();
      //invoke business method
      System.out.println(service.sayHelloWorldFrom("SEMYON"));
  }
}
