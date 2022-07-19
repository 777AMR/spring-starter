package com.example.spring.service;

import com.example.spring.Listener.entity.AccessType;
import com.example.spring.Listener.entity.EntityEvent;
import com.example.spring.database.entity.Company;
import com.example.spring.database.repository.CrudRepository;
import com.example.spring.dto.CompanyReadDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserService userService;
    private final ApplicationEventPublisher applicationEventPublisher;

    public CompanyService(CrudRepository<Integer, Company> companyCrudRepository, UserService userService, ApplicationEventPublisher applicationEventPublisher) {
        this.companyCrudRepository = companyCrudRepository;
        this.userService = userService;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyCrudRepository.findById(id)
                .map(entity -> {
                    applicationEventPublisher.publishEvent(new EntityEvent(entity, AccessType.READ));
                    return new CompanyReadDto(entity.id());
                });
    }
}