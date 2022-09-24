package com.stavsam.employeemanagement.repository;

import com.stavsam.employeemanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespository extends JpaRepository<EmployeeEntity,Long> {

    EmployeeEntity findByEmployeeId(Long id);
}
