/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.djtu.vwater.dal.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 
 *
 * @author pig code generator
 * @date 2022-01-06 14:48:30
 */
@Data
@TableName("order_header")
@EqualsAndHashCode(callSuper = true)

public class OrderHeader extends BaseEntity {

    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 租户id
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer tenantId;

    /**
     * 外部订单编号
     */
    private String orderSn;

    /**
     * 订单展示编号
     */
    private String displayedOrderSn;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 是否货到付款
     */
    private Boolean isCod;

    /**
     * 货到付款金额
     */
    private BigDecimal codAmount;

    /**
     * 接单截止时间
     */
    private LocalDateTime acceptDeadline;

    /**
     * 支付时间
     */
    private LocalDateTime paymentTime;

    /**
     * 订单物品总价格
     */
    private BigDecimal subTotal;

    /**
     * 物流价格
     */
    private BigDecimal shippingCost;

    /**
     * 税
     */
    private BigDecimal tax;

    /**
     * 保险费
     */
    private BigDecimal insurance;

    /**
     * 佣金
     */
    private BigDecimal commissionFee;

    /**
     * 平台服务费
     */
    private BigDecimal serviceFee;

    /**
     * 其他费用
     */
    private BigDecimal otherCost;

    /**
     * 买家交易费,shopee专用
     */
    private BigDecimal buyerTransactionFee;

    /**
     * 最终物流费
     */
    private BigDecimal finalShippingFee;

    /**
     * 信用卡手续费
     */
    private BigDecimal creditCardCharge;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 运费折扣
     */
    private BigDecimal shippingDiscount;

    /**
     * 订单最终总价格
     */
    private BigDecimal totalPrice;

    /**
     * 卖家最终收入
     */
    private BigDecimal totalSales;

    /**
     * 托管金额 shopee专用
     */
    private BigDecimal escrowAmount;

    /**
     * 总重量（g）
     */
    private BigDecimal totalWeight;

    /**
     * 价格单位
     */
    private String priceUom;

    /**
     * 退款金额
     */
    private BigDecimal returnRefund;

    /**
     * 店铺关联表主键id
     */
    private Long shopRelId;

    /**
     * 外部平台名
     */
    private String platformName;

    /**
     * toko 专用标识是否是自营订单
     */
    private Boolean isFulfillment;

    /**
     * toko 专用标识是否是自营订单
     */
    private Boolean fulfillBy;

    /**
     * 0未拆分，1拆分
     */
    private Boolean splitted;

    /**
     * 订单创建时间
     */
    private LocalDateTime orderCreateTime;

    /**
     * 订单更新时间
     */
    private LocalDateTime orderUpdateTime;

}
