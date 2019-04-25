package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Runwater;
import org.sang.yun.pojo.RunwaterExample;

public interface RunwaterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Runwater record);

    int insertSelective(Runwater record);

    List<Runwater> selectByExample(RunwaterExample example);

    Runwater selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Runwater record);

    int updateByPrimaryKey(Runwater record);
}