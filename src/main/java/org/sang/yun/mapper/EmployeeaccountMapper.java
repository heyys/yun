package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Employeeaccount;
import org.sang.yun.pojo.EmployeeaccountExample;

public interface EmployeeaccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeaccount record);

    int insertSelective(Employeeaccount record);

    List<Employeeaccount> selectByExample(EmployeeaccountExample example);

    Employeeaccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeaccount record);

    int updateByPrimaryKey(Employeeaccount record);
}