package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Warehouse;
import org.sang.yun.pojo.WarehouseExample;

public interface WarehouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}