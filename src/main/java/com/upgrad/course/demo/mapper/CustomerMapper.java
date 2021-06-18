package com.upgrad.course.demo.mapper;

import com.upgrad.course.demo.dto.CustomerDTO;
import com.upgrad.course.demo.entity.CustomerEntity;

public class CustomerMapper {

    public static CustomerEntity convertDTOToEntity(CustomerDTO customerDTO) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setFirstName(customerDTO.getFirstName());
        customerEntity.setLastName(customerDTO.getLastName());
        customerEntity.setMobileNo(customerDTO.getPrimaryMobileNo());
        customerEntity.setAlternateMobileNo(customerDTO.getAlternateMobileNo());
        customerEntity.setEmailId(customerDTO.getEmailId());
        customerEntity.setMainAddress(customerDTO.getMainAddress());
        customerEntity.setAlternateAddress(customerDTO.getAlternateAddress());
        return customerEntity;
    }

    public static CustomerDTO convertEntityToDTO(CustomerEntity customerEntity) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerId(customerEntity.getCustomerId());
        customerDTO.setFirstName(customerEntity.getFirstName());
        customerDTO.setLastName(customerEntity.getLastName());
        customerDTO.setPrimaryMobileNo(customerEntity.getMobileNo());
        customerDTO.setAlternateMobileNo(customerEntity.getAlternateMobileNo());
        customerDTO.setEmailId(customerEntity.getEmailId());
        customerDTO.setMainAddress(customerEntity.getMainAddress());
        customerDTO.setAlternateAddress(customerEntity.getAlternateAddress());
        return customerDTO;
    }
}
