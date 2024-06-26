/**
 * 
 */
package com.sm.en.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.en.entity.Employee;

/**
 * @author SHUBHAM Mhatre
 * @since FEB-2024
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
