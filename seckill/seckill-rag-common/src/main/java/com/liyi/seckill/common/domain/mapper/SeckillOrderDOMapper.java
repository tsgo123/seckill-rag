package com.liyi.seckill.common.domain.mapper;

import com.liyi.seckill.common.domain.dataobject.SeckillOrderDO;
import org.apache.ibatis.annotations.Param;

public interface SeckillOrderDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillOrderDO record);

    int insertSelective(SeckillOrderDO record);

    SeckillOrderDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillOrderDO record);

    int updateByPrimaryKey(SeckillOrderDO record);

}