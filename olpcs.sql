/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : course

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 07/04/2021 10:54:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom`  (
  `classroom_id` int NOT NULL AUTO_INCREMENT,
  `classroom_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `classroom_number_limit` int NOT NULL COMMENT '人数限制',
  PRIMARY KEY (`classroom_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 104 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of classroom
-- ----------------------------
INSERT INTO `classroom` VALUES (101, '1A101', 50);
INSERT INTO `classroom` VALUES (102, '1A102', 50);
INSERT INTO `classroom` VALUES (103, '1A103', 50);

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `comment_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NOT NULL,
  `course_id` int NOT NULL,
  `comment_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `comment_star` int NOT NULL COMMENT '星级评价，1星-2星-3星-4星-5星',
  `comment_time` datetime(0) NOT NULL COMMENT '评论时间',
  PRIMARY KEY (`comment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, 1, 101, '测试评论内容1', 5, '2021-03-01 20:09:16');
INSERT INTO `comment` VALUES (2, 2, 101, '测试评论内容2', 5, '2021-03-01 20:09:16');
INSERT INTO `comment` VALUES (3, 1, 102, '测试评论内容3', 5, '2021-03-01 20:09:16');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `teacher_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `classroom_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教室',
  `course_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名称',
  `course_image` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `course_description` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '描述',
  `course_start_date` datetime(0) NOT NULL COMMENT '开课日期',
  `course_term` int NOT NULL COMMENT '总学时',
  `course_number_limit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '人数限制',
  `course_price` decimal(10, 2) NOT NULL COMMENT '原价格',
  `course_vip_price` decimal(10, 2) NOT NULL COMMENT '会员优惠价格',
  `course_status` int NOT NULL COMMENT '课程出售状态，0->暂停出售，1->出售中',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 106 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (101, '10001', '101', '七年级下册英语', 'http://www.s3tu.com/images/2021/04/04/9d35a6fce735f3537bcf4.jpg', '七年级下册英语描述', '2021-03-01 17:16:53', 20, '30', 100.00, 80.00, 1);
INSERT INTO `course` VALUES (102, '10002', '102', '七年级上册数学', 'http://www.s3tu.com/images/2021/04/03/5e026c27b2fd6772c21ea.jpg', '七年级上册数学描述', '2021-03-02 17:16:53', 20, '30', 110.00, 90.00, 1);
INSERT INTO `course` VALUES (103, '10003', '102', '七年级下册语文', 'http://www.s3tu.com/images/2021/04/04/e4766c91b4e562c2d5af9.jpg', '七年级下册语文描述', '2021-03-03 17:16:53', 20, '30', 120.00, 100.00, 0);
INSERT INTO `course` VALUES (104, '10002', '102', '八年级下册物理', 'http://www.s3tu.com/images/2021/04/04/a5aa4d509ea51135fbf86.jpg', '八年级下册物理描述', '2021-03-04 17:16:53', 20, '30', 130.00, 110.00, 1);
INSERT INTO `course` VALUES (105, '10001', '102', '八年级下册中国历史', 'http://www.s3tu.com/images/2021/04/04/63cbf1a3c7883e34c4729.jpg', '八年级下册中国历史描述', '2021-03-05 17:16:53', 20, '30', 140.00, 100.00, 0);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NULL DEFAULT NULL,
  `course_id` int NULL DEFAULT NULL,
  `order_class_hour` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所购买课程的课时',
  `order_amount` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交易金额',
  `order_time` datetime(0) NULL DEFAULT NULL COMMENT '下单时间',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for sign_in
-- ----------------------------
DROP TABLE IF EXISTS `sign_in`;
CREATE TABLE `sign_in`  (
  `sign_in_id` int NOT NULL AUTO_INCREMENT,
  `course_id` int NOT NULL,
  `teacher_id` int NOT NULL,
  `classroom_id` int NOT NULL,
  `class_hour_cost` int NOT NULL COMMENT '课时消耗',
  `start_time` datetime(0) NOT NULL COMMENT '签到开始时间',
  `finish_time` datetime(0) NOT NULL COMMENT '签到结束时间',
  PRIMARY KEY (`sign_in_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sign_in
-- ----------------------------

-- ----------------------------
-- Table structure for signed_in
-- ----------------------------
DROP TABLE IF EXISTS `signed_in`;
CREATE TABLE `signed_in`  (
  `signed_in_id` int NOT NULL AUTO_INCREMENT,
  `sign_in_id` int NOT NULL,
  `student_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `signed_in_time` datetime(0) NOT NULL COMMENT '签到时间',
  `signed_in_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '签到状态，0->签到，1->已签到',
  PRIMARY KEY (`signed_in_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of signed_in
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NULL DEFAULT NULL,
  `student_image` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像图片',
  `student_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实姓名',
  `student_gender` int NOT NULL COMMENT '性别：0->未知；1->男；2->女',
  `student_phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号码',
  `student_email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱',
  `student_account_balance` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户余额',
  `student_payment_password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '支付密码',
  `student_vip_status` int NOT NULL COMMENT '会员状态：0->未开通；1->已开通',
  `student_vip_time` datetime(0) NULL DEFAULT NULL COMMENT '会员剩余时长',
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 100004, 'null', '学生一', 0, '12345678', '100004@mail.com', '0', 'test100004', 0, '2021-03-29 19:07:24');
INSERT INTO `student` VALUES (2, 100005, 'null', '学生二', 0, '123456789', '100005@mail.com', '1', 'test100005', 0, '2021-03-29 19:07:24');

-- ----------------------------
-- Table structure for student_order
-- ----------------------------
DROP TABLE IF EXISTS `student_order`;
CREATE TABLE `student_order`  (
  `student_order_id` int NOT NULL AUTO_INCREMENT,
  `student_id` int NULL DEFAULT NULL,
  `course_id` int NULL DEFAULT NULL,
  `total_class_hour` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已拥有总时长',
  `used_class_hour` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '已使用时长',
  PRIMARY KEY (`student_order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_order
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `teacher_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NULL DEFAULT NULL,
  `teacher_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `teacher_image` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像图片',
  `teacher_phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `teacher_email` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱地址',
  `teacher_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '个人描述',
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10004 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (10001, 100001, '李华', 'null', '10001', '10001@mail.com', '讲师个人描述10001');
INSERT INTO `teacher` VALUES (10002, 100002, '张三', 'null', '10002', '10002@mail.com', '讲师个人描述10002');
INSERT INTO `teacher` VALUES (10003, 100003, '王五', 'null', '10003', '10003@mail.com', '讲师个人描述10003');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `password` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_status` int NULL DEFAULT NULL COMMENT '0->管理员，1->讲师，2->讲师',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 123457 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (100001, '100001', 'testteacher1', 1);
INSERT INTO `user` VALUES (100002, '100002', 'testteacher2', 1);
INSERT INTO `user` VALUES (100003, '100003', 'testteacher3', 1);
INSERT INTO `user` VALUES (100004, '100004', 'teststudent1', 2);
INSERT INTO `user` VALUES (100005, '100005', 'teststudent2', 2);
INSERT INTO `user` VALUES (123456, '123456', 'admin', 0);

SET FOREIGN_KEY_CHECKS = 1;
