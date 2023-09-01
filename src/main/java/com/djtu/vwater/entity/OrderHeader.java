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
package com.djtu.vwater.entity;

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
     * tenantId
     */
	@TableField(fill = FieldFill.INSERT)
    private Integer tenantId;

    /**
     * 外部订单编号
     */
    private String orderSn;

    /**
     * tokopedia订单展示编号
     */
    private String invoiceRelNum;

    /**
     * 订单状态码
     */
    private Integer statusCode;

    /**
     * 外部订单状态
     */
    private String externalStatus;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 是否预定订单
     */
    private Boolean isPreOrder;

    /**
     * 是否货到付款
     */
    private Boolean isCod;

    /**
     * 货到付款金额
     */

    private BigDecimal codAmount;

    /**
     * 支付时间
     */
    @TableField(value = "payment_time")
    private LocalDateTime paymentTime;

    /**
     * 接单截止时间
     */
    private LocalDateTime acceptDeadline;

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
     * 平台物流费
     */
    private BigDecimal otherCost;

    private BigDecimal buyerTransactionFee;

    private BigDecimal finalShippingFee;

    /**
     * 信用卡手续费
     */
    private BigDecimal creditCardCharge;

    /**
     * 折扣
     */
    private BigDecimal discount;

    private BigDecimal shippingDiscount;

    /**
     * 订单最终总价格
     */
    private BigDecimal totalPrice;

    private BigDecimal escrowAmount;


    /**
     * 卖家最终收入
     */
    private BigDecimal totalSales;
    /**
     * 总重量(g)
     */
    private BigDecimal totalWeight;

    /**
     * 价格单位
     */
    private String priceUom;

    /**
     * 是否已打印包装详情面单
     */
    private Boolean packingListPrinted;

    /**
     * 是否已打印标签面单
     */
    private Boolean labelPrinted;

    /**
     * 是否已打印发票
     */
    private Boolean invoicePrinted;

    /**
     * 是否已打印拣货单
     */
    private Boolean pickingListPrinted;

    /**
     * 退款金额
     */

    private BigDecimal returnRefund;

	/**
	 * 是否请求取消订单
	 */
    private Boolean isRequestCancel;

	/**
	 * 取消对象(buyer,seller,system)
	 */
    private String cancelBy;

    /**
     * 取消原因
     */
    private String cancelReason;

    /**
     * 取消时间
     */
    private LocalDateTime cancelTime;

    /**
     * 店铺关联表主键id
     */
    private Long shopRelId;

    /**
     * 外部平台名
     */
    private String platformName;

    /**
     * 卖家备注
     */
    private String sellerNotes;

    /**
     * 买家备注
     */
    private String buyerNotes;



	public boolean isFulfillment=false;

	private boolean fulfillBy=false;
    /**
     * 订单创建时间
     */
    private LocalDateTime orderCreateTime;

	/**
	 * 订单修改时间
	 */
	private LocalDateTime orderUpdateTime;

    /**
     * shopee专用-发货人员
     */
    private String dropShipper;

    /**
     * shopee 专用 发货联系电话
     */
    private String dropShipperPhone;

    /**
     * 出站标识
     */

    private Boolean outbound;

    /**
     * 商品匹配标识 matched貌似是sql关键字使用起来不方便
     */

    private Boolean itemMatched;
}
