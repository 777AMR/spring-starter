package com.example.spring;

import com.example.spring.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
//        clazz -> String -> Map<String, Object>
        ConnectionPool connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);

    }
}
