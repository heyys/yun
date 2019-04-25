package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Productimg;
import org.sang.yun.pojo.ProductimgExample;

public interface ProductimgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Productimg record);

    int insertSelective(Productimg record);

    List<Productimg> selectByExample(ProductimgExample example);

    Productimg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Productimg record);

    int updateByPrimaryKey(Productimg record);
}