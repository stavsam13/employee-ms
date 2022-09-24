package com.stavsam.employeemanagement.services;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.stavsam.employeemanagement.entity.EmployeeEntity;
import com.stavsam.employeemanagement.model.EmployeeDTO;
import com.stavsam.employeemanagement.repository.EmployeeRespository;
import com.stavsam.employeemanagement.util.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRespository employeeRespository;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    public EmployeeDTO getEmployeeById(Long employeeId) {
        LOGGER.info("Get Employee by Id has started");
        EmployeeEntity employeeEntity = employeeRespository.findByEmployeeId(employeeId);
        return Mapper.convertEntityToDTO(employeeEntity);
    }


}
