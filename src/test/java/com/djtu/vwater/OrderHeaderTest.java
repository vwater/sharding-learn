package com.djtu.vwater;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.djtu.vwater.dal.entity.OrderHeader;
import com.djtu.vwater.dal.entity.OrderHeaderHot;
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
    @Autowired
    private HotOrderHeaderMapper hotOrderHeaderMapper;

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Test
    void insetData() {
        List<OrderHeaderHot> orderHeaders = hotOrderHeaderMapper.selectList(Wrappers.lambdaQuery(OrderHeaderHot.class)
                .eq(OrderHeaderHot::getTenantId,0));
        for (OrderHeaderHot orderHeaderHot:orderHeaders){
            OrderHeader orderHeader = new OrderHeader();
            orderHeader.setTenantId(orderHeaderHot.getTenantId());
            orderHeader.setId(orderHeaderHot.getId()+1);
            orderHeader.setOrderSn(orderHeaderHot.getOrderSn());
            orderHeader.setCreateTime(orderHeaderHot.getCreateTime());
            orderHeaderMapper.insert(orderHeader);
        }

    }
    @Test
    void testQuerySharding(){
        List<OrderHeader> orderHeaders = orderHeaderMapper.selectList(Wrappers.lambdaQuery(OrderHeader.class)
                .eq(OrderHeader::getTenantId,0)
                .lt(OrderHeader::getCreateTime,LocalDateTime.now())
        );
        System.out.println();
    }

}
