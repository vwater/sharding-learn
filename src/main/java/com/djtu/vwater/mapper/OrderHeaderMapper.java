package com.djtu.vwater.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djtu.vwater.entity.OrderHeader;
import com.djtu.vwater.vo.OrderDetailVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

/**
 * @author omni
 */
@Mapper
public interface OrderHeaderMapper extends BaseMapper<OrderHeader> {

    Page<OrderDetailVo> queryOrderDetail(Page page, @Param("startTime") LocalDateTime startTime, @Param("endTime")LocalDateTime endTime);

}
