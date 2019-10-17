package com.os.system.mapper;

import com.os.system.model.Department;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentMapper {
    @Select("select * from department")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "department",column = "department")
    })
    List<Department> selectByDepartment();
}
