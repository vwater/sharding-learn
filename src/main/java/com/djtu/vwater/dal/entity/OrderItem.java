package com.djtu.vwater.dal.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author vwater
 */
@Data
@TableName("order_item")
@EqualsAndHashCode(callSuper = true)
public class OrderItem extends BaseEntity {

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
     * 对应的订单id
     */
    private Long orderId;

    /**
     * package表主键
     */
    private Long orderPackageId;

    /**
     * 外部item id
     */
    private String externalItemId;

    /**
     * 共享仓库id
     */
    private Long masterWarehouseId;

    /**
     * 绑定的master sku id
     */
    private Long masterSkuId;

    /**
     * 绑定的master sku的masterSku
     */
    private String masterSku;

    /**
     * 外部仓库id
     */
    private String externalWarehouseId;

    /**
     * 外部的sku id
     */
    private String externalSkuId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 主图url
     */
    private String mainImageUrl;

    /**
     * 变体名/变体属性值数组拼接
     */
    private String variantName;

    /**
     * 外部的skuCode
     */
    private String skuCode;

    /**
     * 数量
     */
    private BigDecimal quantity;

    /**
     * 原价
     */
    private BigDecimal unitPrice;

    /**
     * 折后价
     */
    private BigDecimal paidPrice;

    /**
     * 优惠价格
     */
    private BigDecimal itemDiscount;

    /**
     * 卖家优惠价格
     */
    private BigDecimal sellerDiscount;

    /**
     * 平台折扣价格
     */
    private BigDecimal platformDiscount;

    /**
     * 实际物流费用
     */
    private BigDecimal shippingCost;

    /**
     * blibli item 最终总价
     */
    private BigDecimal itemTotalPrice;

    /**
     * blibli item 总价
     */
    private BigDecimal itemSubTotalPrice;

    /**
     * blibli 税费
     */
    private BigDecimal itemTax;

    /**
     * blibli支付费用
     */
    private BigDecimal paymentFee;

    /**
     * blibli运费险
     */
    private BigDecimal shippingInsuranceCost;

    /**
     * blibli最终物流费
     */
    private BigDecimal itemFinalShippingFee;

    /**
     * blibli服务费
     */
    private BigDecimal itemServiceFee;

    /**
     * item卖家最终收入
     */
    private BigDecimal itemTotalPayment;

    /**
     * blibli item在订单总数
     */
    private BigDecimal itemTotalQuantity;

    /**
     * blibli取消商品数量
     */
    private BigDecimal canceledQuantity;
}
