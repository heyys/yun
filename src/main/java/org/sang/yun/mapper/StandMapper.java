package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Stand;
import org.sang.yun.pojo.StandExample;

public interface StandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stand record);

    int insertSelective(Stand record);

    List<Stand> selectByExample(StandExample example);

    Stand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stand record);

    int updateByPrimaryKey(Stand record);
}