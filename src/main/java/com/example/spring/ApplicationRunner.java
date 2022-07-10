package com.example.spring;

import com.example.spring.database.pool.ConnectionPool;
import com.example.spring.database.repository.CompanyRepository;
import com.example.spring.database.repository.UserRepository;
import com.example.spring.ioc.Container;
import com.example.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        var container = new Container();

//        var connectionPool = new ConnectionPool();
//        var userRepository = new UserRepository(connectionPool);
//        var companyRepository = new CompanyRepository(connectionPool);
//        var userService = new UserService(userRepository, companyRepository);

//        var connectionPool = container.get(ConnectionPool.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);

        var userService = container.get(UserService.class);
        //TODO 10.07.2022 userService
    }
}
