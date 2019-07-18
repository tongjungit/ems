package com.zyjava.emsservice.mapper;

import com.zyjava.emsapi.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    // 添加员工
    void save(Employee employee);

    // 根据id删除员工
    void delById(String id);

    // 根据id查询员工
    Employee getById(String id);

    // 修改员工
    void update(Employee employee);

    // 员工列表
    List<Employee> findAll();

}
