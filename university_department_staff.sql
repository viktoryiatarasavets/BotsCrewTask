-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `department_staff`
--

DROP TABLE IF EXISTS `department_staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department_staff` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_id` int(11) NOT NULL,
  `lector_id` int(11) NOT NULL,
  `head_of_department` tinyint(4) NOT NULL DEFAULT '0',
  `salary` double NOT NULL,
  PRIMARY KEY (`record_id`),
  KEY `lector_id_idx` (`lector_id`),
  KEY `department_id_idx` (`department_id`),
  CONSTRAINT `department_id` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `lector_id` FOREIGN KEY (`lector_id`) REFERENCES `lector` (`lector_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department_staff`
--

LOCK TABLES `department_staff` WRITE;
/*!40000 ALTER TABLE `department_staff` DISABLE KEYS */;
INSERT INTO `department_staff` VALUES (1,1,1,1,1000),(2,2,2,1,1000),(3,3,3,1,1000),(4,1,4,0,100),(5,2,5,0,540),(6,3,6,0,340),(7,1,7,0,390),(8,2,8,0,390),(9,3,9,0,600),(10,1,10,0,510),(11,1,5,0,300),(12,2,9,0,690),(13,3,4,0,130),(14,2,10,0,70);
/*!40000 ALTER TABLE `department_staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-20 12:16:26
