package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.StockInType;
import org.sang.yun.pojo.StockInTypeExample;

public interface StockInTypeMapper {
    int insert(StockInType record);

    int insertSelective(StockInType record);

    List<StockInType> selectByExample(StockInTypeExample example);
}