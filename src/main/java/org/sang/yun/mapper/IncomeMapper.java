package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Income;
import org.sang.yun.pojo.IncomeExample;

public interface IncomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Income record);

    int insertSelective(Income record);

    List<Income> selectByExample(IncomeExample example);

    Income selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}