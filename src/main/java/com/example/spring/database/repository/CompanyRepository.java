package com.example.spring.database.repository;

import com.example.spring.bpp.Auditing;
import com.example.spring.bpp.InjectBean;
import com.example.spring.bpp.Transaction;
import com.example.spring.database.entity.Company;
import com.example.spring.database.pool.ConnectionPool;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @InjectBean
    public ConnectionPool connectionPool;

    @PostConstruct
    public void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
