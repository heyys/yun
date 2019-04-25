package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Department;
import org.sang.yun.pojo.DepartmentExample;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}