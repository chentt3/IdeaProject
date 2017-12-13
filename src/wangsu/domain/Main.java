package wangsu.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //创建ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //获取实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

        helloWorld.sayHello();
        helloWorld.sum();
        helloWorld.cheng();
        helloWorld.jian();
    }
}
