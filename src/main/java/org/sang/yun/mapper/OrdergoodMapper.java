package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Ordergood;
import org.sang.yun.pojo.OrdergoodExample;

public interface OrdergoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ordergood record);

    int insertSelective(Ordergood record);

    List<Ordergood> selectByExample(OrdergoodExample example);

    Ordergood selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ordergood record);

    int updateByPrimaryKey(Ordergood record);
}