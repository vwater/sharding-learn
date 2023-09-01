package com.djtu.vwater.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.djtu.vwater.entity.OrderHeader;
import com.djtu.vwater.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author omni
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {

}
