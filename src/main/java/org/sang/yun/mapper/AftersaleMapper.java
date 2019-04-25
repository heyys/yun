package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Aftersale;
import org.sang.yun.pojo.AftersaleExample;

public interface AftersaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Aftersale record);

    int insertSelective(Aftersale record);

    List<Aftersale> selectByExample(AftersaleExample example);

    Aftersale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Aftersale record);

    int updateByPrimaryKey(Aftersale record);
}