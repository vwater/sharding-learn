package com.djtu.vwater;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djtu.vwater.entity.OrderHeader;
import com.djtu.vwater.entity.OrderItem;
import com.djtu.vwater.mapper.OrderHeaderMapper;
import com.djtu.vwater.mapper.OrderItemMapper;
import com.djtu.vwater.vo.OrderDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
@Slf4j
@SpringBootTest
public class OrderHeaderTest {
    @Autowired
    private OrderHeaderMapper orderHeaderMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Test
    void insetData(){
        OrderHeader orderHeader = new OrderHeader();
        orderHeader.setOrderSn("7758521");
        orderHeader.setCreateTime(LocalDateTime.now());
        orderHeaderMapper.insert(orderHeader);
        OrderItem orderItem = new OrderItem();
        orderItem.setCreateTime(LocalDateTime.now());

        orderItem.setOrderId(orderHeader.getId());
        orderItemMapper.insert(orderItem);
    }

    @Test
    void crossTableQuery(){

        LocalDateTime now = LocalDateTime.now();
        Page<OrderHeader> page = new Page<>(2, 2);
        Page<OrderDetailVo> orderDetailVoPage = orderHeaderMapper.queryOrderDetail(page,now.plusMonths(-3),now);
        log.info("test");
    }
}
