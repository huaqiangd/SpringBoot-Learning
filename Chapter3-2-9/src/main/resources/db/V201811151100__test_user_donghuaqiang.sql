DROP TABLE IF EXISTS `test_user` ;


CREATE TABLE `test_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(30) NOT NULL COMMENT '姓名',
  `age` int(5) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

