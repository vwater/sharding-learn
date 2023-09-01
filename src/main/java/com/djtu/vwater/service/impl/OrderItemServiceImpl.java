package com.djtu.vwater.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djtu.vwater.entity.OrderItem;
import com.djtu.vwater.mapper.OrderItemMapper;
import com.djtu.vwater.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * @author vwater
 */
@Service
public class OrderItemServiceImpl  extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}

