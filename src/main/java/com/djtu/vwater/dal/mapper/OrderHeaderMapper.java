package com.djtu.vwater.dal.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.djtu.vwater.dal.entity.OrderHeader;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

/**
 * @author omni
 */
@Mapper
@DS("sharding")
public interface OrderHeaderMapper extends BaseMapper<OrderHeader> {


}
