package com.os.system.web;

import com.os.system.mapper.DepartmentMapper;
import com.os.system.model.Department;
import com.os.system.tools.LayuiResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/department")
public class DepartmentController {
    @Autowired
    public DepartmentMapper  departmentMapper;
    @RequestMapping(value = "/getDepartmentJSP", method = RequestMethod.GET)
    public String getDepartmentJSP() {
        System.out.println("第一次访问department.jsp");
        return "department";
    }
    @RequestMapping(value = "getDepartmentData", produces = "application/json;charset=utf-8")
    @ResponseBody
    public LayuiResultMap<List<Department>> getDepartmentData() {
        List<Department> dDist = departmentMapper.selectByDepartment();
        return new LayuiResultMap<List<Department>>("", dDist, 0, 100);
    }
}
