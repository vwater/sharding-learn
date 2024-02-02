/*
 Navicat Premium Data Transfer

 Source Server         : local-mysql
 Source Server Type    : MySQL
 Source Server Version : 80100
 Source Host           : localhost:3305
 Source Schema         : archive_order_2024

 Target Server Type    : MySQL
 Target Server Version : 80100
 File Encoding         : 65001

 Date: 02/02/2024 18:05:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_header_0
-- ----------------------------
DROP TABLE IF EXISTS `order_header_0`;
CREATE TABLE `order_header_0` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `order_sn` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '外部订单编号',
  `displayed_order_sn` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '订单展示编号',
  `payment_method` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '支付方式',
  `is_cod` tinyint(1) DEFAULT '0' COMMENT '是否货到付款',
  `cod_amount` decimal(18,0) DEFAULT '0' COMMENT '货到付款金额',
  `accept_deadline` datetime DEFAULT NULL COMMENT '接单截止时间',
  `payment_time` datetime DEFAULT NULL COMMENT '支付时间',
  `sub_total` decimal(18,0) DEFAULT '0' COMMENT '订单物品总价格',
  `shipping_cost` decimal(18,0) DEFAULT '0' COMMENT '物流价格',
  `tax` decimal(18,0) DEFAULT '0' COMMENT '税',
  `insurance` decimal(18,0) DEFAULT '0' COMMENT '保险费',
  `commission_fee` decimal(18,0) DEFAULT '0' COMMENT '佣金',
  `service_fee` decimal(18,0) DEFAULT '0' COMMENT '平台服务费',
  `other_cost` decimal(18,0) DEFAULT '0' COMMENT '其他费用',
  `buyer_transaction_fee` decimal(18,0) DEFAULT '0' COMMENT '买家交易费,shopee专用',
  `final_shipping_fee` decimal(18,0) DEFAULT '0' COMMENT '最终物流费',
  `credit_card_charge` decimal(18,0) DEFAULT '0' COMMENT '信用卡手续费',
  `discount` decimal(18,0) DEFAULT '0' COMMENT '折扣',
  `shipping_discount` decimal(18,0) DEFAULT '0' COMMENT '运费折扣',
  `total_price` decimal(18,0) DEFAULT '0' COMMENT '订单最终总价格',
  `total_sales` decimal(18,0) DEFAULT '0' COMMENT '卖家最终收入',
  `escrow_amount` decimal(18,0) DEFAULT '0' COMMENT '托管金额 shopee专用',
  `total_weight` decimal(18,0) DEFAULT '0' COMMENT '总重量（g）',
  `price_uom` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '价格单位',
  `return_refund` decimal(18,0) DEFAULT '0' COMMENT '退款金额',
  `shop_rel_id` bigint DEFAULT NULL COMMENT '店铺关联表主键id',
  `platform_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部平台名',
  `is_fulfillment` tinyint(1) DEFAULT '0' COMMENT 'toko 专用标识是否是自营订单',
  `fulfill_by` tinyint(1) DEFAULT '0' COMMENT 'toko 专用标识是否是自营订单',
  `splitted` tinyint(1) DEFAULT '0' COMMENT '0:未拆包，1:拆包',
  `order_create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `order_update_time` datetime DEFAULT NULL COMMENT '订单更新时间',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`,`shop_rel_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`,`order_create_time`) USING BTREE,
  KEY `idx_oh_orderSn` (`order_sn`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`,`order_update_time`) USING BTREE,
  KEY `idx_oh_displayedOrderSn` (`displayed_order_sn`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for order_header_1
-- ----------------------------
DROP TABLE IF EXISTS `order_header_1`;
CREATE TABLE `order_header_1` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `order_sn` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '外部订单编号',
  `displayed_order_sn` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '订单展示编号',
  `payment_method` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '支付方式',
  `is_cod` tinyint(1) DEFAULT '0' COMMENT '是否货到付款',
  `cod_amount` decimal(18,0) DEFAULT '0' COMMENT '货到付款金额',
  `accept_deadline` datetime DEFAULT NULL COMMENT '接单截止时间',
  `payment_time` datetime DEFAULT NULL COMMENT '支付时间',
  `sub_total` decimal(18,0) DEFAULT '0' COMMENT '订单物品总价格',
  `shipping_cost` decimal(18,0) DEFAULT '0' COMMENT '物流价格',
  `tax` decimal(18,0) DEFAULT '0' COMMENT '税',
  `insurance` decimal(18,0) DEFAULT '0' COMMENT '保险费',
  `commission_fee` decimal(18,0) DEFAULT '0' COMMENT '佣金',
  `service_fee` decimal(18,0) DEFAULT '0' COMMENT '平台服务费',
  `other_cost` decimal(18,0) DEFAULT '0' COMMENT '其他费用',
  `buyer_transaction_fee` decimal(18,0) DEFAULT '0' COMMENT '买家交易费,shopee专用',
  `final_shipping_fee` decimal(18,0) DEFAULT '0' COMMENT '最终物流费',
  `credit_card_charge` decimal(18,0) DEFAULT '0' COMMENT '信用卡手续费',
  `discount` decimal(18,0) DEFAULT '0' COMMENT '折扣',
  `shipping_discount` decimal(18,0) DEFAULT '0' COMMENT '运费折扣',
  `total_price` decimal(18,0) DEFAULT '0' COMMENT '订单最终总价格',
  `total_sales` decimal(18,0) DEFAULT '0' COMMENT '卖家最终收入',
  `escrow_amount` decimal(18,0) DEFAULT '0' COMMENT '托管金额 shopee专用',
  `total_weight` decimal(18,0) DEFAULT '0' COMMENT '总重量（g）',
  `price_uom` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '价格单位',
  `return_refund` decimal(18,0) DEFAULT '0' COMMENT '退款金额',
  `shop_rel_id` bigint DEFAULT NULL COMMENT '店铺关联表主键id',
  `platform_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部平台名',
  `is_fulfillment` tinyint(1) DEFAULT '0' COMMENT 'toko 专用标识是否是自营订单',
  `fulfill_by` tinyint(1) DEFAULT '0' COMMENT 'toko 专用标识是否是自营订单',
  `splitted` tinyint(1) DEFAULT '0' COMMENT '0:未拆包，1:拆包',
  `order_create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `order_update_time` datetime DEFAULT NULL COMMENT '订单更新时间',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`,`shop_rel_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`,`order_create_time`) USING BTREE,
  KEY `idx_oh_orderSn` (`order_sn`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`,`order_update_time`) USING BTREE,
  KEY `idx_oh_displayedOrderSn` (`displayed_order_sn`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for order_item_0
-- ----------------------------
DROP TABLE IF EXISTS `order_item_0`;
CREATE TABLE `order_item_0` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `order_id` bigint NOT NULL COMMENT '对应的订单id',
  `order_package_id` bigint NOT NULL COMMENT 'package表主键',
  `external_item_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部item id',
  `master_warehouse_id` bigint DEFAULT NULL COMMENT '共享仓库id',
  `master_sku_id` bigint DEFAULT NULL COMMENT '绑定的master sku id',
  `master_sku` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '绑定的master sku的masterSku',
  `external_warehouse_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部仓库id',
  `external_sku_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部的sku id',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '产品名称',
  `main_image_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '主图url',
  `variant_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '变体名/变体属性值数组拼接',
  `sku_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部的skuCode',
  `quantity` decimal(18,0) DEFAULT '0' COMMENT '数量',
  `unit_price` decimal(18,0) DEFAULT '0' COMMENT '原价',
  `paid_price` decimal(18,0) DEFAULT '0' COMMENT '折后价',
  `item_discount` decimal(18,0) DEFAULT '0' COMMENT '优惠价格',
  `seller_discount` decimal(18,0) DEFAULT '0' COMMENT '卖家优惠价格',
  `platform_discount` decimal(18,0) DEFAULT '0' COMMENT '平台折扣价格',
  `shipping_cost` decimal(18,0) DEFAULT '0' COMMENT '实际物流费用',
  `item_total_price` decimal(18,0) DEFAULT '0' COMMENT 'blibli item 最终总价',
  `item_sub_total_price` decimal(18,0) DEFAULT '0' COMMENT 'blibli item 总价',
  `item_tax` decimal(18,0) DEFAULT '0' COMMENT 'blibli 税费',
  `payment_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli支付费用',
  `shipping_insurance_cost` decimal(18,0) DEFAULT '0' COMMENT 'blibli运费险',
  `item_final_shipping_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli最终物流费',
  `item_service_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli服务费',
  `item_total_payment` decimal(18,0) DEFAULT '0' COMMENT 'item卖家最终收入',
  `item_total_quantity` decimal(18,0) DEFAULT NULL COMMENT 'blibli item在订单总数',
  `canceled_quantity` decimal(18,0) DEFAULT '0' COMMENT 'blibli取消商品数量',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oi_tenant_opId` (`tenant_id`,`order_package_id`) USING BTREE,
  KEY `idx_oi_tenant_ohId` (`tenant_id`,`order_id`) USING BTREE,
  KEY `idx_oi_ext_id` (`tenant_id`,`external_sku_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Table structure for order_item_1
-- ----------------------------
DROP TABLE IF EXISTS `order_item_1`;
CREATE TABLE `order_item_1` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `order_id` bigint NOT NULL COMMENT '对应的订单id',
  `order_package_id` bigint NOT NULL COMMENT 'package表主键',
  `external_item_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部item id',
  `master_warehouse_id` bigint DEFAULT NULL COMMENT '共享仓库id',
  `master_sku_id` bigint DEFAULT NULL COMMENT '绑定的master sku id',
  `master_sku` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '绑定的master sku的masterSku',
  `external_warehouse_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部仓库id',
  `external_sku_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部的sku id',
  `product_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_ci DEFAULT NULL COMMENT '产品名称',
  `main_image_url` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '主图url',
  `variant_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '变体名/变体属性值数组拼接',
  `sku_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL COMMENT '外部的skuCode',
  `quantity` decimal(18,0) DEFAULT '0' COMMENT '数量',
  `unit_price` decimal(18,0) DEFAULT '0' COMMENT '原价',
  `paid_price` decimal(18,0) DEFAULT '0' COMMENT '折后价',
  `item_discount` decimal(18,0) DEFAULT '0' COMMENT '优惠价格',
  `seller_discount` decimal(18,0) DEFAULT '0' COMMENT '卖家优惠价格',
  `platform_discount` decimal(18,0) DEFAULT '0' COMMENT '平台折扣价格',
  `shipping_cost` decimal(18,0) DEFAULT '0' COMMENT '实际物流费用',
  `item_total_price` decimal(18,0) DEFAULT '0' COMMENT 'blibli item 最终总价',
  `item_sub_total_price` decimal(18,0) DEFAULT '0' COMMENT 'blibli item 总价',
  `item_tax` decimal(18,0) DEFAULT '0' COMMENT 'blibli 税费',
  `payment_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli支付费用',
  `shipping_insurance_cost` decimal(18,0) DEFAULT '0' COMMENT 'blibli运费险',
  `item_final_shipping_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli最终物流费',
  `item_service_fee` decimal(18,0) DEFAULT '0' COMMENT 'blibli服务费',
  `item_total_payment` decimal(18,0) DEFAULT '0' COMMENT 'item卖家最终收入',
  `item_total_quantity` decimal(18,0) DEFAULT NULL COMMENT 'blibli item在订单总数',
  `canceled_quantity` decimal(18,0) DEFAULT '0' COMMENT 'blibli取消商品数量',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oi_tenant_opId` (`tenant_id`,`order_package_id`) USING BTREE,
  KEY `idx_oi_tenant_ohId` (`tenant_id`,`order_id`) USING BTREE,
  KEY `idx_oi_ext_id` (`tenant_id`,`external_sku_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
