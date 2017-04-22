# Host: localhost  (Version: 5.0.18-nt)
# Date: 2016-10-28 16:23:24
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "blog"
#

DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(50) default NULL,
  `content` varchar(255) default NULL,
  `categoryId` int(11) default NULL,
  `createdTime` date default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "blog"
#

INSERT INTO `blog` VALUES (2,'第二次发博文','不紧张',2,NULL),(3,'abc','abcdefg',1,'2016-10-25'),(7,'111111111','11111111111111111111111111111111111111',1,'2016-10-26'),(8,'0001','000000000000000000001',1,'2016-10-26'),(9,'00','00',1,'2016-10-26'),(10,'11','111',1,'2016-10-26'),(11,'22','22222',1,'2016-10-26'),(12,'33','come  on',1,'2016-10-26'),(13,'44','44444',1,'2016-10-26'),(14,'心灰意冷','大大大滴滴答答',1,'2016-10-26');

#
# Source for table "category"
#

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `level` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "category"
#

INSERT INTO `category` VALUES (1,'JSP',2),(2,'SERVLET',1),(3,'JAVABEAN',3),(4,'MVC',2);

#
# Source for table "comment"
#

DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL auto_increment,
  `userName` varchar(50) default NULL,
  `content` varchar(255) default NULL,
  `createdTime` date default NULL,
  `blogId` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "comment"
#


#
# Source for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `userName` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'admin','admin'),(2,'xxl','123'),(3,'张三','李四'),(4,'张123','李四'),(5,'张123','李四');
