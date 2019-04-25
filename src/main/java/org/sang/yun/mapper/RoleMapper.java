package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Role;
import org.sang.yun.pojo.RoleExample;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);
}