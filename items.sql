/*
Navicat MySQL Data Transfer

Source Server         : Demo
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-01-28 15:15:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for items
-- ----------------------------
DROP TABLE IF EXISTS `items`;
CREATE TABLE `items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=478 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of items
-- ----------------------------
INSERT INTO `items` VALUES ('465', '服务1的数据', '服务1的数据', '服务1的数据');
INSERT INTO `items` VALUES ('466', '服务feign的数据', '服务feign的数据', '服务feign的数据');
INSERT INTO `items` VALUES ('469', '服务2的数据', '服务2的数据', '服务2的数据');
INSERT INTO `items` VALUES ('470', '服务2的数据', '服务2的数据', '服务2的数据');
INSERT INTO `items` VALUES ('475', '服务feign的数据', '服务feign的数据', '服务feign的数据');
