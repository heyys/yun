package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Give;
import org.sang.yun.pojo.GiveExample;

public interface GiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Give record);

    int insertSelective(Give record);

    List<Give> selectByExample(GiveExample example);

    Give selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Give record);

    int updateByPrimaryKey(Give record);
}