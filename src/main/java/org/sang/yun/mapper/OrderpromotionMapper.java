package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Orderpromotion;
import org.sang.yun.pojo.OrderpromotionExample;

public interface OrderpromotionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderpromotion record);

    int insertSelective(Orderpromotion record);

    List<Orderpromotion> selectByExample(OrderpromotionExample example);

    Orderpromotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderpromotion record);

    int updateByPrimaryKey(Orderpromotion record);
}