package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Placeorder;
import org.sang.yun.pojo.PlaceorderExample;

public interface PlaceorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Placeorder record);

    int insertSelective(Placeorder record);

    List<Placeorder> selectByExample(PlaceorderExample example);

    Placeorder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Placeorder record);

    int updateByPrimaryKey(Placeorder record);
}