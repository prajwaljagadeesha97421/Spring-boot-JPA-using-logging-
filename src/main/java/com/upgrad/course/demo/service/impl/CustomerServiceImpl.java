package com.upgrad.course.demo.service.impl;

import com.upgrad.course.demo.dto.CustomerDTO;
import com.upgrad.course.demo.entity.CustomerEntity;
import com.upgrad.course.demo.exception.RecordNotFoundException;
import com.upgrad.course.demo.mapper.CustomerMapper;
import com.upgrad.course.demo.repository.CustomerRepo;
import com.upgrad.course.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public CustomerDTO saveCustomerData(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = CustomerMapper.convertDTOToEntity(customerDTO);
        customerEntity = customerRepo.save(customerEntity);
        CustomerDTO customerDTOResponse = CustomerMapper.convertEntityToDTO(customerEntity);
        return customerDTOResponse;
    }

    @Override
    public CustomerDTO getCustomerData(int customerId) throws RecordNotFoundException {
        CustomerEntity customerEntity =
                customerRepo.findById(customerId)
                        .orElseThrow(() -> new RecordNotFoundException("Customer details for customer[" + customerId + "] does not exist"));
        CustomerDTO customerDTO = CustomerMapper.convertEntityToDTO(customerEntity);
        return customerDTO;
    }
}
