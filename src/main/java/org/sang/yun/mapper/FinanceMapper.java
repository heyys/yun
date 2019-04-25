package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Finance;
import org.sang.yun.pojo.FinanceExample;

public interface FinanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    int insertSelective(Finance record);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}