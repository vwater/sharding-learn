package com.djtu.vwater.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.djtu.vwater.entity.OrderHeader;
import com.djtu.vwater.mapper.OrderHeaderMapper;
import com.djtu.vwater.service.OrderHeaderService;
import org.springframework.stereotype.Service;

/**
 * @author vwater
 */
@Service
public class OrderHeaderServiceImpl extends ServiceImpl<OrderHeaderMapper, OrderHeader> implements OrderHeaderService {

}
