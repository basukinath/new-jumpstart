/*
 Navicat Premium Data Transfer

 Source Server         : mysqlrootconn
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : jumpstart

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 18/09/2020 18:17:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence`  (
  `next_val` bigint(20) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES (14);

-- ----------------------------
-- Table structure for mentor_associate_mapping
-- ----------------------------
DROP TABLE IF EXISTS `mentor_associate_mapping`;
CREATE TABLE `mentor_associate_mapping`  (
  `mappingid` int(11) NOT NULL AUTO_INCREMENT,
  `mentorid` int(11) NULL DEFAULT NULL,
  `associateid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`mappingid`) USING BTREE,
  INDEX `mentorid`(`mentorid`) USING BTREE,
  INDEX `associateid`(`associateid`) USING BTREE,
  CONSTRAINT `mentor_associate_mapping_ibfk_1` FOREIGN KEY (`mentorid`) REFERENCES `registration` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mentor_associate_mapping_ibfk_2` FOREIGN KEY (`associateid`) REFERENCES `registration` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mentor_associate_mapping
-- ----------------------------
INSERT INTO `mentor_associate_mapping` VALUES (1, 1, 5);
INSERT INTO `mentor_associate_mapping` VALUES (2, 1, 4);
INSERT INTO `mentor_associate_mapping` VALUES (3, 1, 2);
INSERT INTO `mentor_associate_mapping` VALUES (4, 1, 2);
INSERT INTO `mentor_associate_mapping` VALUES (5, 1, 2);
INSERT INTO `mentor_associate_mapping` VALUES (7, 1, 3);

-- ----------------------------
-- Table structure for plan
-- ----------------------------
DROP TABLE IF EXISTS `plan`;
CREATE TABLE `plan`  (
  `planid` int(11) NOT NULL AUTO_INCREMENT,
  `plan_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`planid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of plan
-- ----------------------------
INSERT INTO `plan` VALUES (1, 'LEARN SQL');
INSERT INTO `plan` VALUES (2, 'MACHINE LEARNING');
INSERT INTO `plan` VALUES (3, 'MATHEMATICS');
INSERT INTO `plan` VALUES (4, 'DEVOPS');
INSERT INTO `plan` VALUES (5, 'SECOPS');
INSERT INTO `plan` VALUES (6, 'MLOPS');
INSERT INTO `plan` VALUES (7, 'CICD');
INSERT INTO `plan` VALUES (9, 'hello there');
INSERT INTO `plan` VALUES (11, 'Jumpstart - Java');
INSERT INTO `plan` VALUES (12, 'Jumpstart - Oracle');
INSERT INTO `plan` VALUES (13, 'Jumpstart - .net');

-- ----------------------------
-- Table structure for registration
-- ----------------------------
DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `organization` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `area_of_interest` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `exp_mentor` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image` blob NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of registration
-- ----------------------------
INSERT INTO `registration` VALUES (1, 'Basu', 'bsknath@gmail.com', '12345678', 'MENTOR', 'xyz', 'ML', '5', 0x4E554C4C);
INSERT INTO `registration` VALUES (2, 'Shesho', 'sheshanath@gmail.com', '12345678', 'ASSOCIATED', '', '', '', 0x4E554C4C);
INSERT INTO `registration` VALUES (3, 'Pratibha', 'paro@gmail.com', '12345678', 'ASSOCIATED', '', '', '', 0x4E554C4C);
INSERT INTO `registration` VALUES (4, 'Shobha', 'Shobha@gmail.com', '12345678', 'ASSOCIATED', '', '', '', 0x4E554C4C);
INSERT INTO `registration` VALUES (5, 'Shobha', 'Shobha@gmail.com', '12345678', 'ASSOCIATED', '', '', '', 0x4E554C4C);

-- ----------------------------
-- Table structure for taskassignment
-- ----------------------------
DROP TABLE IF EXISTS `taskassignment`;
CREATE TABLE `taskassignment`  (
  `plan_taskid` int(11) NOT NULL,
  `plan_id` int(11) NULL DEFAULT NULL,
  `associateid` int(11) NOT NULL,
  `course` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `assessment` bit(1) NOT NULL,
  `date` datetime(6) NULL DEFAULT NULL,
  `percentage` double NULL DEFAULT NULL,
  `resources` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`plan_taskid`) USING BTREE,
  INDEX `plan_id`(`plan_id`) USING BTREE,
  INDEX `associateid`(`associateid`) USING BTREE,
  CONSTRAINT `taskassignment_ibfk_1` FOREIGN KEY (`plan_id`) REFERENCES `plan` (`planid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `taskassignment_ibfk_2` FOREIGN KEY (`associateid`) REFERENCES `registration` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of taskassignment
-- ----------------------------
INSERT INTO `taskassignment` VALUES (1, 1, 1, '1', b'1', '2020-09-18 18:09:29.000000', 1, '1');

SET FOREIGN_KEY_CHECKS = 1;
