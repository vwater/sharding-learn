package com.djtu.vwater.dal.mapper.hot;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djtu.vwater.dal.entity.OrderHeaderHot;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author omni
 */
@Mapper
@DS("sharding")
public interface HotOrderHeaderMapper extends BaseMapper<OrderHeaderHot> {


}
