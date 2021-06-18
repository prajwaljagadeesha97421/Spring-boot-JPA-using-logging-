package com.upgrad.course.demo.service;

import com.upgrad.course.demo.dto.CustomerDTO;
import com.upgrad.course.demo.exception.RecordNotFoundException;

import java.util.Optional;

public interface CustomerService {

    /**
     * Saves customer personal details.
     * @param customerDTO
     * @return
     */
    public CustomerDTO saveCustomerData(CustomerDTO customerDTO);

    /**
     * Get a customer data using customer id.
     * @param customerId
     * @return
     */
    public CustomerDTO getCustomerData(int customerId) throws RecordNotFoundException;
}
