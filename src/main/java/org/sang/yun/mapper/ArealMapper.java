package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Areal;
import org.sang.yun.pojo.ArealExample;

public interface ArealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Areal record);

    int insertSelective(Areal record);

    List<Areal> selectByExample(ArealExample example);

    Areal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Areal record);

    int updateByPrimaryKey(Areal record);
}