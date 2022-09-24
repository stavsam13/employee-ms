package com.stavsam.employeemanagement.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.stavsam.employeemanagement.entity.EmployeeEntity;
import com.stavsam.employeemanagement.model.EmployeeDTO;

public class Mapper {

    public static final ObjectMapper MAPPER =
            new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                    .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

    public static EmployeeDTO convertEntityToDTO(EmployeeEntity employeeEntity) {
        return MAPPER.convertValue(employeeEntity,EmployeeDTO.class);
    }

    private static EmployeeEntity convertDTOtoEntity(EmployeeDTO employeeDTO) {
        return MAPPER.convertValue(employeeDTO,EmployeeEntity.class);
    }
}
