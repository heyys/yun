package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Dist;
import org.sang.yun.pojo.DistExample;

public interface DistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dist record);

    int insertSelective(Dist record);

    List<Dist> selectByExample(DistExample example);

    Dist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dist record);

    int updateByPrimaryKey(Dist record);
}