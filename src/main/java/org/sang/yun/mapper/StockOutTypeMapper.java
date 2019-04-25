package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.StockOutType;
import org.sang.yun.pojo.StockOutTypeExample;

public interface StockOutTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StockOutType record);

    int insertSelective(StockOutType record);

    List<StockOutType> selectByExample(StockOutTypeExample example);

    StockOutType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StockOutType record);

    int updateByPrimaryKey(StockOutType record);
}