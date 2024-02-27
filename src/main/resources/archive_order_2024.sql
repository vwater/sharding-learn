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

 Date: 27/02/2024 22:24:59
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
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `migrate_tag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_header_0
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_header_1
-- ----------------------------
DROP TABLE IF EXISTS `order_header_1`;
CREATE TABLE `order_header_1` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `migrate_tag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_header_1
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_header_2
-- ----------------------------
DROP TABLE IF EXISTS `order_header_2`;
CREATE TABLE `order_header_2` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `migrate_tag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_header_2
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_header_3
-- ----------------------------
DROP TABLE IF EXISTS `order_header_3`;
CREATE TABLE `order_header_3` (
  `id` bigint NOT NULL,
  `tenant_id` int NOT NULL,
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `update_by` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_as_cs DEFAULT NULL,
  `migrate_tag` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `idx_oh_tenant_shoprel_id` (`tenant_id`) USING BTREE,
  KEY `idx_oh_tenant_create` (`tenant_id`) USING BTREE,
  KEY `idx_oh.tenant_update` (`tenant_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_cs ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_header_3
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_item_0
-- ----------------------------
DROP TABLE IF EXISTS `order_item_0`;
CREATE TABLE `order_item_0` (
  `id` int NOT NULL,
  `tenant_id` int DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_item_0
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_item_1
-- ----------------------------
DROP TABLE IF EXISTS `order_item_1`;
CREATE TABLE `order_item_1` (
  `id` int NOT NULL,
  `tenant_id` int DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_item_1
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_item_2
-- ----------------------------
DROP TABLE IF EXISTS `order_item_2`;
CREATE TABLE `order_item_2` (
  `id` int NOT NULL,
  `tenant_id` int DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_item_2
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for order_item_3
-- ----------------------------
DROP TABLE IF EXISTS `order_item_3`;
CREATE TABLE `order_item_3` (
  `id` int NOT NULL,
  `tenant_id` int DEFAULT NULL,
  `order_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_as_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of order_item_3
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Procedure structure for migrate_header
-- ----------------------------
DROP PROCEDURE IF EXISTS `migrate_header`;
delimiter ;;
CREATE PROCEDURE `migrate_header`()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE current_id INT;
    DECLARE current_tenant_id INT;
    DECLARE current_order_create_time TIMESTAMP;
    
    DECLARE cur CURSOR FOR
        SELECT id, tenant_id, order_create_time
        FROM omni_order.order_header
        WHERE migrate_tag = 1;
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
    OPEN cur;
    
    read_loop: LOOP
        FETCH cur INTO current_id, current_tenant_id, current_order_create_time;
        
        IF done THEN
            LEAVE read_loop;
        END IF;
        
        IF current_order_create_time < '2024-01-01 00:00:00' THEN
            SET @target_db = 'archive_order_2023';
        ELSE
            SET @target_db = 'archive_order_2024';
        END IF;
        
        SET @target_table = CONCAT('order_header_', current_tenant_id % 100);
        SELECT * FROM omni_order.order_header WHERE id = current_id;
        SET @sql = CONCAT('INSERT INTO ', @target_db, '.', @target_table, ' SELECT * FROM omni_order.order_header WHERE id = ', current_id);
        PREPARE stmt FROM @sql;
        EXECUTE stmt;
        DEALLOCATE PREPARE stmt;
        
        UPDATE omni_order.order_header SET migrate_tag = 1 WHERE id = current_id;
        
    END LOOP;
    
    CLOSE cur;
    
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
