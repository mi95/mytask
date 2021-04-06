
DROP TABLE IF EXISTS `user_infos`;
CREATE TABLE `user_infos` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `phone` char(11) DEFAULT NULL COMMENT '电话',
  `password` varchar(125) not NULL COMMENT '密码',
  `parent_id` int not NULL default 0 COMMENT '推荐人',
  `name` varchar(125) DEFAULT NULL COMMENT '名称',
  `team_num` int not null default 0 COMMENT '团队人数',
  `balance` int not null default 0  COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='用户表';

DROP TABLE IF EXISTS `user_task`;
CREATE TABLE `user_task` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) not NULL COMMENT '用户编号',
  `task_id` int(11) not NULL COMMENT '任务编号',
  `status` int(11) not NULL COMMENT '状态 0-审核不通过 1-待审核 2-审核中 3-审核通过',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户任务表';

DROP TABLE IF EXISTS `task_infos`;
CREATE TABLE `task_infos` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(125) not null COMMENT '标题',
  `price` decimal(10,2) not null COMMENT '任务价格',
  `status` int not null default 1 COMMENT '状态 0-禁用 1-正常',
  `remark` varchar(127) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='任务表';

DROP TABLE IF EXISTS `task_step`;
CREATE TABLE `task_step` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` int(11) NOT NULL COMMENT '任务编号',
  `step_num` int NOT NULL COMMENT '步骤编号',
  `remark` varchar(512) NOT NULL COMMENT '步骤描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='任务步骤表';

DROP TABLE IF EXISTS `task_step_img`;
CREATE TABLE `task_step_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `task_id` int(11) NOT NULL COMMENT '任务编号',
  `task_step_id` int(11) NOT NULL COMMENT '步骤编号',
  `img_url`  varchar(512) NOT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='图片表';
