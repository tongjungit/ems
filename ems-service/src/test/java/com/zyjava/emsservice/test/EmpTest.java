package com.zyjava.emsservice.test;


import com.zyjava.emsapi.entity.Employee;
import com.zyjava.emsservice.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;

public class EmpTest {



    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
        EmployeeMapper employeeMapper = ac.getBean(EmployeeMapper.class);
        Employee employee=new Employee();
        employee.setId(UUID.randomUUID().toString());
        employee.setName("白子画");
        employee.setAddress("长留");
        employee.setPhone("119");
        employeeMapper.save(employee);
    }

}
