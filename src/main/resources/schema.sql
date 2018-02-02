--
-- Table structure for table `book`
--

CREATE TABLE book (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `title` varchar(50) NOT NULL COMMENT '图书名',
  `author` varchar(32) NOT NULL COMMENT '图书作者',
  PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
