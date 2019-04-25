package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Unit;
import org.sang.yun.pojo.UnitExample;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}