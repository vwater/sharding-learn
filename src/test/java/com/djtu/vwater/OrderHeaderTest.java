package com.djtu.vwater;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.djtu.vwater.dal.entity.OrderHeader;
import com.djtu.vwater.dal.entity.OrderItem;
import com.djtu.vwater.dal.mapper.OrderHeaderMapper;
import com.djtu.vwater.dal.mapper.OrderItemMapper;
import com.djtu.vwater.dal.mapper.hot.HotOrderHeaderMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@SpringBootTest
public class OrderHeaderTest {
    @Autowired
    private OrderHeaderMapper orderHeaderMapper;
//    @Autowired
//    private HotOrderHeaderMapper hotOrderHeaderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;
    @Test
    void insetData(){
        List<OrderHeader> orderHeaders = new ArrayList<>();
        OrderHeader orderHeader1 = new OrderHeader();
        orderHeader1.setTenantId(1);
        orderHeader1.setCreateTime(LocalDateTime.now());
        orderHeaders.add(orderHeader1);
        OrderHeader orderHeader2 = new OrderHeader();
        orderHeader2.setTenantId(0);
        orderHeader2.setCreateTime(LocalDateTime.now());

        orderHeaders.add(orderHeader2);
        for (OrderHeader orderHeader:orderHeaders){
            orderHeaderMapper.insert(orderHeader);
        }
//        OrderItem orderItem = new OrderItem();
//        orderItem.setCreateTime(now);
//        orderItem.setTenantId(99);
//
//        orderItem.setOrderId(orderHeader.getId());
//        orderItemMapper.insert(orderItem);
    }

}
