package com.djtu.vwater.dal.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djtu.vwater.dal.entity.OrderItem;
import com.djtu.vwater.dal.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
 * @author vwater
 */
@Service
public class OrderItemServiceDao extends ServiceImpl<OrderItemMapper, OrderItem> {

}

