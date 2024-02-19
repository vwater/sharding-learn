package com.djtu.vwater.dal.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djtu.vwater.dal.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author omni
 */
@Mapper
@DS("sharding")
public interface OrderItemMapper extends BaseMapper<OrderItem> {

}
