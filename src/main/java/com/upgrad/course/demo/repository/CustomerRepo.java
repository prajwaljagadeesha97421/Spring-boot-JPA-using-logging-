package com.upgrad.course.demo.repository;

import com.upgrad.course.demo.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<CustomerEntity, Integer> {
}
