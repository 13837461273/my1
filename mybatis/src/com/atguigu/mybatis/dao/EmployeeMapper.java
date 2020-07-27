package com.atguigu.mybatis.dao;

import com.atguigu.mybatis.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    public Employee getEmployeeById(Integer id);
    public Long addEmp(Employee employee);
    public void updateEmp(Employee employee);
    public void deleteEmpById(Integer id);
    public List<Employee> getEmpByIdAndName(@Param("id") Integer id, @Param("lastName") String lastName);
    public Employee getEmpByMap(Map map);

    List<Employee> getEmps(Integer[] arr);

    List<Map<String,Object>> getEmpAndAddress();
}
