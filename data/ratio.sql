/*
 Navicat Premium Data Transfer

 Source Server         : local-wit-esg
 Source Server Type    : MySQL
 Source Server Version : 80033
 Source Host           : localhost:3306
 Source Schema         : data_model

 Target Server Type    : MySQL
 Target Server Version : 80033
 File Encoding         : 65001

 Date: 08/07/2024 13:45:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ratio
-- ----------------------------
DROP TABLE IF EXISTS `ratio`;
CREATE TABLE `ratio`  (
  `food_security` double NULL DEFAULT NULL,
  `country` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `affordability` double NULL DEFAULT NULL,
  `availability` double NULL DEFAULT NULL,
  `quality` double NULL DEFAULT NULL,
  `sustainability` double NULL DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 113 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of ratio
-- ----------------------------
INSERT INTO `ratio` VALUES (62.5, 'Algeria', 78.9, 57.3, 54.5, 54.3, 1);
INSERT INTO `ratio` VALUES (45.5, 'Angola', 35.5, 44.6, 50.7, 54.5, 2);
INSERT INTO `ratio` VALUES (64.7, 'Argentina', 62.4, 61.2, 85.5, 50.7, 3);
INSERT INTO `ratio` VALUES (70.7, 'Australia', 84.2, 60.3, 76.1, 58.8, 4);
INSERT INTO `ratio` VALUES (77.7, 'Austria', 90, 67, 81.2, 69.7, 5);
INSERT INTO `ratio` VALUES (60.8, 'Azerbaijan', 82.6, 55.6, 54.4, 43.9, 6);
INSERT INTO `ratio` VALUES (69.3, 'Bahrain', 87.2, 58.2, 79.5, 47.3, 7);
INSERT INTO `ratio` VALUES (53.6, 'Bangladesh', 51.4, 61.1, 57.4, 44.1, 8);
INSERT INTO `ratio` VALUES (69.1, 'Belarus', 84.9, 54.6, 76.3, 57.1, 9);
INSERT INTO `ratio` VALUES (74.5, 'Belgium', 89.6, 61.4, 82.4, 61, 10);
INSERT INTO `ratio` VALUES (46.6, 'Benin', 52.6, 45.4, 48.2, 38.1, 11);
INSERT INTO `ratio` VALUES (64.7, 'Bolivia', 72.6, 67.1, 70, 46, 12);
INSERT INTO `ratio` VALUES (54.7, 'Botswana', 73, 50.2, 57.1, 32.7, 13);
INSERT INTO `ratio` VALUES (66.2, 'Brazil', 66.4, 59, 83.8, 56.3, 14);
INSERT INTO `ratio` VALUES (72.2, 'Bulgaria', 82.9, 67.4, 78.8, 56.4, 15);
INSERT INTO `ratio` VALUES (51.8, 'Burkina Faso', 50.1, 55.5, 55.4, 46.3, 16);
INSERT INTO `ratio` VALUES (39.3, 'Burundi', 30.3, 39.1, 52.2, 38.8, 17);
INSERT INTO `ratio` VALUES (55, 'Cambodia', 72.3, 56, 51.3, 34.5, 18);
INSERT INTO `ratio` VALUES (48.4, 'Cameroon', 50.7, 37.5, 58.3, 47.4, 19);
INSERT INTO `ratio` VALUES (79.5, 'Canada', 88.6, 77, 89.5, 60.1, 20);
INSERT INTO `ratio` VALUES (42.4, 'Chad', 43.5, 44.7, 44.8, 36.1, 21);
INSERT INTO `ratio` VALUES (74.4, 'Chile', 81.5, 71.2, 76.2, 66.6, 22);
INSERT INTO `ratio` VALUES (70.6, 'China', 76.1, 78.7, 73.6, 51.2, 23);
INSERT INTO `ratio` VALUES (63, 'Colombia', 71, 55.5, 67.3, 56.3, 24);
INSERT INTO `ratio` VALUES (44.5, 'Congo (Dem. Rep.)', 46.3, 41.1, 50, 40.2, 25);
INSERT INTO `ratio` VALUES (77.7, 'Costa Rica', 85.5, 72.3, 78.1, 72.8, 26);
INSERT INTO `ratio` VALUES (48.4, 'Côte d\'Ivoire', 57.2, 46.8, 45, 42, 27);
INSERT INTO `ratio` VALUES (76.6, 'Czech Republic', 87.3, 68.1, 78, 70.3, 28);
INSERT INTO `ratio` VALUES (77.3, 'Denmark', 92.6, 60.3, 89.1, 63.8, 29);
INSERT INTO `ratio` VALUES (64.8, 'Dominican Rep.', 77.8, 58.8, 63.8, 55.1, 30);
INSERT INTO `ratio` VALUES (64.9, 'Ecuador', 70.6, 57.3, 68.5, 62, 31);
INSERT INTO `ratio` VALUES (58.5, 'Egypt', 72.9, 54.3, 46.7, 55.7, 32);
INSERT INTO `ratio` VALUES (62.3, 'El Salvador', 73.4, 70.5, 64.5, 36.3, 33);
INSERT INTO `ratio` VALUES (42.7, 'Ethiopia', 28.6, 43.9, 58.4, 44.7, 34);
INSERT INTO `ratio` VALUES (82.7, 'Finland', 91, 67.5, 88.4, 82.6, 35);
INSERT INTO `ratio` VALUES (78.3, 'France', 90.2, 63.2, 87.5, 70.3, 36);
INSERT INTO `ratio` VALUES (77.3, 'Germany', 89.5, 66, 79.9, 70.8, 37);
INSERT INTO `ratio` VALUES (54.2, 'Ghana', 60.4, 53.3, 56.7, 44.3, 38);
INSERT INTO `ratio` VALUES (72.5, 'Greece', 89, 56, 80.8, 60.6, 39);
INSERT INTO `ratio` VALUES (59.1, 'Guatemala', 63.5, 45.9, 60.3, 66.5, 40);
INSERT INTO `ratio` VALUES (46.4, 'Guinea', 40.7, 49.9, 39.9, 56.8, 41);
INSERT INTO `ratio` VALUES (38.5, 'Haiti', 32.1, 49.9, 37.5, 35.5, 42);
INSERT INTO `ratio` VALUES (62.3, 'Honduras', 57.6, 67.4, 65.2, 59.8, 43);
INSERT INTO `ratio` VALUES (68.5, 'Hungary', 82.7, 60.8, 72.7, 53.8, 44);
INSERT INTO `ratio` VALUES (58.4, 'India', 53, 68.5, 61.4, 51.4, 45);
INSERT INTO `ratio` VALUES (59.8, 'Indonesia', 78.1, 57, 52.9, 45.5, 46);
INSERT INTO `ratio` VALUES (81.6, 'Ireland', 93.1, 69.5, 86.1, 75.1, 47);
INSERT INTO `ratio` VALUES (73.1, 'Israel', 90.4, 65.8, 87.4, 44, 48);
INSERT INTO `ratio` VALUES (74.1, 'Italy', 89, 69.6, 75.9, 57.3, 49);
INSERT INTO `ratio` VALUES (79.5, 'Japan', 88.9, 81.7, 77.7, 66.2, 50);
INSERT INTO `ratio` VALUES (65.6, 'Jordan', 82.6, 60.5, 57.1, 57.2, 51);
INSERT INTO `ratio` VALUES (70.7, 'Kazakhstan', 82.4, 57, 76.9, 64, 52);
INSERT INTO `ratio` VALUES (52.6, 'Kenya', 50.6, 50.6, 58.7, 51.4, 53);
INSERT INTO `ratio` VALUES (68, 'Kuwait', 86.4, 56.5, 78.7, 45.5, 54);
INSERT INTO `ratio` VALUES (49, 'Laos', 53.2, 45, 52, 45.1, 55);
INSERT INTO `ratio` VALUES (43.3, 'Madagascar', 43.9, 43.4, 40.8, 44.8, 56);
INSERT INTO `ratio` VALUES (45.3, 'Malawi', 31.5, 46.1, 51.1, 57, 57);
INSERT INTO `ratio` VALUES (71.5, 'Malaysia', 87.4, 65.3, 75.3, 53.6, 58);
INSERT INTO `ratio` VALUES (52, 'Mali', 54.9, 54.5, 56.5, 40.8, 59);
INSERT INTO `ratio` VALUES (70.9, 'Mexico', 77.4, 66.2, 78.1, 60.3, 60);
INSERT INTO `ratio` VALUES (64.3, 'Morocco', 74.4, 48.7, 72.3, 60.4, 61);
INSERT INTO `ratio` VALUES (45.3, 'Mozambique', 46.5, 44.4, 41.5, 48.5, 62);
INSERT INTO `ratio` VALUES (58.3, 'Myanmar', 64.2, 53.2, 65.1, 49.3, 63);
INSERT INTO `ratio` VALUES (55.1, 'Nepal', 49.2, 68.7, 57, 45.9, 64);
INSERT INTO `ratio` VALUES (79.9, 'Netherlands', 90.9, 70.1, 87, 69.2, 65);
INSERT INTO `ratio` VALUES (77.4, 'New Zealand', 90.5, 67.5, 73.3, 75.1, 66);
INSERT INTO `ratio` VALUES (57.6, 'Nicaragua', 67, 52.5, 57.8, 50.2, 67);
INSERT INTO `ratio` VALUES (49.7, 'Niger', 44.2, 54.4, 46.9, 54.6, 68);
INSERT INTO `ratio` VALUES (46.8, 'Nigeria', 35.3, 45.8, 56, 53.8, 69);
INSERT INTO `ratio` VALUES (78.4, 'Norway', 83.2, 62.5, 80.8, 87.4, 70);
INSERT INTO `ratio` VALUES (72.3, 'Oman', 87.4, 67.5, 76.1, 53.6, 71);
INSERT INTO `ratio` VALUES (50, 'Pakistan', 53.9, 58.8, 49.5, 35.4, 72);
INSERT INTO `ratio` VALUES (74.2, 'Panama', 86.3, 71.8, 74.8, 60.1, 73);
INSERT INTO `ratio` VALUES (64.6, 'Paraguay', 83.8, 53.6, 76.6, 39.1, 74);
INSERT INTO `ratio` VALUES (73.1, 'Peru', 86.1, 61.4, 74.3, 67.5, 75);
INSERT INTO `ratio` VALUES (59.6, 'Philippines', 74.6, 54.8, 64.6, 40, 76);
INSERT INTO `ratio` VALUES (75, 'Poland', 86.1, 61.6, 83.4, 66.7, 77);
INSERT INTO `ratio` VALUES (77, 'Portugal', 88.8, 66.8, 85.8, 63.7, 78);
INSERT INTO `ratio` VALUES (74.6, 'Qatar', 91.8, 73.5, 74.8, 52.9, 79);
INSERT INTO `ratio` VALUES (69.3, 'Romania', 83.7, 62.1, 76.9, 50.4, 80);
INSERT INTO `ratio` VALUES (71.7, 'Russia', 84.6, 63.5, 78.7, 56.6, 81);
INSERT INTO `ratio` VALUES (44.6, 'Rwanda', 29.9, 51.7, 49.3, 51.9, 82);
INSERT INTO `ratio` VALUES (68.2, 'Saudi Arabia', 79.2, 67.5, 71.9, 50.5, 83);
INSERT INTO `ratio` VALUES (50.8, 'Senegal', 56.6, 48, 53.3, 43.5, 84);
INSERT INTO `ratio` VALUES (62, 'Serbia', 83.8, 44.1, 77.7, 37.1, 85);
INSERT INTO `ratio` VALUES (42.9, 'Sierra Leone', 40.6, 39.3, 45, 47.9, 86);
INSERT INTO `ratio` VALUES (72.8, 'Singapore', 91.7, 78.4, 69.8, 44.5, 87);
INSERT INTO `ratio` VALUES (71, 'Slovakia', 88.9, 54.9, 78.4, 57.6, 88);
INSERT INTO `ratio` VALUES (64.9, 'South Africa', 65.5, 64, 72.4, 57.5, 89);
INSERT INTO `ratio` VALUES (68.9, 'South Korea', 79.2, 69, 73.4, 50.4, 90);
INSERT INTO `ratio` VALUES (76.6, 'Spain', 88.3, 67.5, 81.2, 66.5, 91);
INSERT INTO `ratio` VALUES (55.5, 'Sri Lanka', 59, 59.1, 60.1, 42.1, 92);
INSERT INTO `ratio` VALUES (38.8, 'Sudan', 29.3, 41.1, 53.3, 34.5, 93);
INSERT INTO `ratio` VALUES (77.7, 'Sweden', 90.4, 64.5, 85, 68.3, 94);
INSERT INTO `ratio` VALUES (78, 'Switzerland', 89.1, 76.7, 73, 69.5, 95);
INSERT INTO `ratio` VALUES (36.2, 'Syria', 32, 26.1, 50.6, 38.5, 96);
INSERT INTO `ratio` VALUES (54.4, 'Tajikistan', 53, 55.7, 57, 52.2, 97);
INSERT INTO `ratio` VALUES (48.2, 'Tanzania', 45.8, 58.8, 49.6, 38.1, 98);
INSERT INTO `ratio` VALUES (62.1, 'Thailand', 83.2, 56.7, 50.9, 51.4, 99);
INSERT INTO `ratio` VALUES (48.5, 'Togo', 51.7, 49.7, 42.4, 48.9, 100);
INSERT INTO `ratio` VALUES (60.4, 'Tunisia', 76.5, 47.2, 64.8, 49, 101);
INSERT INTO `ratio` VALUES (65.6, 'Turkey', 65.8, 59.7, 77.9, 59.6, 102);
INSERT INTO `ratio` VALUES (47, 'Uganda', 48.9, 36.6, 45.9, 57.2, 103);
INSERT INTO `ratio` VALUES (60.6, 'Ukraine', 76.2, 48.1, 71.4, 43.2, 104);
INSERT INTO `ratio` VALUES (73.6, 'United Arab Emirates', 82.6, 76.2, 80.2, 52.1, 105);
INSERT INTO `ratio` VALUES (79.3, 'United Kingdom', 91, 71.8, 80, 71.1, 106);
INSERT INTO `ratio` VALUES (78.7, 'United States', 87.6, 67.3, 88.8, 69.4, 107);
INSERT INTO `ratio` VALUES (69.2, 'Uruguay', 71.7, 63.9, 74.9, 65.8, 108);
INSERT INTO `ratio` VALUES (54.5, 'Uzbekistan', 47.1, 55.4, 62.7, 55.1, 109);
INSERT INTO `ratio` VALUES (44, 'Venezuela', 41.8, 36.4, 58, 41.3, 110);
INSERT INTO `ratio` VALUES (62.7, 'Vietnam', 73, 55.7, 67.1, 52.3, 111);
INSERT INTO `ratio` VALUES (39.8, 'Yemen', 45.7, 26.3, 49.2, 37.6, 112);
INSERT INTO `ratio` VALUES (44.7, 'Zambia', 31.3, 46.1, 53.2, 52.4, 113);

SET FOREIGN_KEY_CHECKS = 1;
