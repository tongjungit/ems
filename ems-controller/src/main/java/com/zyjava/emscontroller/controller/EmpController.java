package com.zyjava.emscontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zyjava.emsapi.entity.Employee;
import com.zyjava.emsapi.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class EmpController {

    @Reference
    private EmpService empService;


    @RequestMapping("/list")
    public String list(Model model){
        List<Employee> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "emplist";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "addEmp";
    }


    @RequestMapping("/add")
    public String save(Employee employee){
        employee.setId(UUID.randomUUID().toString());
        empService.save(employee);
        return "redirect:/list";
    }

    @RequestMapping("/del")
    public String delete(String id){
        empService.delById(id);
        return "redirect:/list";
    }

    @RequestMapping("/load")
    public String load(String id,Model model){
        Employee emp = empService.getById(id);
        model.addAttribute("emp",emp);
        return "updateEmp";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        empService.update(employee);
        return "redirect:/list";
    }



}
