package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Pro_Category;
import org.sang.yun.pojo.Pro_CategoryExample;

public interface Pro_CategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pro_Category record);

    int insertSelective(Pro_Category record);

    List<Pro_Category> selectByExample(Pro_CategoryExample example);

    Pro_Category selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pro_Category record);

    int updateByPrimaryKey(Pro_Category record);
}