package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Promotion;
import org.sang.yun.pojo.PromotionExample;

public interface PromotionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    List<Promotion> selectByExample(PromotionExample example);

    Promotion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}