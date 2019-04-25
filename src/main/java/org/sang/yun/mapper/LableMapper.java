package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Lable;
import org.sang.yun.pojo.LableExample;

public interface LableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lable record);

    int insertSelective(Lable record);

    List<Lable> selectByExample(LableExample example);

    Lable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Lable record);

    int updateByPrimaryKey(Lable record);
}