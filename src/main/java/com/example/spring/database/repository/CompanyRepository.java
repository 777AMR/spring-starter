package com.example.spring.database.repository;

import com.example.spring.bpp.InjectBean;
import com.example.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    @InjectBean
    private ConnectionPool connectionPool;

}
