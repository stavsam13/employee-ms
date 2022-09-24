package com.stavsam.employeemanagement.controller;

import com.stavsam.employeemanagement.services.EmployeeService;
import com.stavsam.employeemanagement.util.ApiEndpoints;
import com.stavsam.employeemanagement.model.EmployeeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ApiEndpoints.BASE_MAPPING)
public class EmployeeControler {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeControler.class);

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = ApiEndpoints.EMPLOYEE_ID)
    public ResponseEntity<EmployeeDTO> getEmployeeById(@RequestParam Long employeeId) {
        LOGGER.info("Retrieval of employee with id{} ",employeeId);
        EmployeeDTO response = employeeService.getEmployeeById(employeeId);
        LOGGER.info("Employee successful retrieved ");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
