package org.sang.yun.mapper;

import java.util.List;
import org.sang.yun.pojo.Receipt;
import org.sang.yun.pojo.ReceiptExample;

public interface ReceiptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    List<Receipt> selectByExample(ReceiptExample example);

    Receipt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);
}