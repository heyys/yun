package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Bills;
import org.sang.yun.pojo.BillsExample;

public interface BillsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bills record);

    int insertSelective(Bills record);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
}