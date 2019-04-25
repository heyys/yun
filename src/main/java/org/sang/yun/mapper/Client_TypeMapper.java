package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Client_Type;
import org.sang.yun.pojo.Client_TypeExample;

public interface Client_TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Client_Type record);

    int insertSelective(Client_Type record);

    List<Client_Type> selectByExample(Client_TypeExample example);

    Client_Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Client_Type record);

    int updateByPrimaryKey(Client_Type record);
}