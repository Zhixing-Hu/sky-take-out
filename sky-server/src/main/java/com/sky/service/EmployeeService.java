package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /*
    * add new employee
    * */
    void save(EmployeeDTO employeeDTO);

    /*
    * Pagination query
    * */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /*
    * Start or Stop Employee Account
    * */
    void startOrStop(Integer status, Long id);

    /*
    * Get employee data by id
    * */
    Employee getById(Long id);

    /*
    * Edit Employee Data
    * */
    void update(EmployeeDTO employeeDTO);
}
