package com.zyjava.emsservice.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.zyjava.emsapi.entity.Employee;
import com.zyjava.emsapi.service.EmpService;
import com.zyjava.emsservice.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 *  实现 ems-api 项目中的 EmpService 接口
 */
// 注释 使用的 阿里的 service 注解
@Service
public class EmpServiceImpl implements EmpService {

    /*注入dao*/
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void save(Employee employee) {
        employeeMapper.save(employee);
    }

    @Override
    public void delById(String id) {
        employeeMapper.delById(id);
    }

    @Override
    public Employee getById(String id) {
        return employeeMapper.getById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }
}
