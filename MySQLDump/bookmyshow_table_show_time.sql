-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bookmyshow
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `table_show_time`
--

DROP TABLE IF EXISTS `table_show_time`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_show_time` (
  `s_id` bigint NOT NULL,
  `c_tid` varchar(255) NOT NULL,
  `c_time` varchar(255) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_show_time`
--

LOCK TABLES `table_show_time` WRITE;
/*!40000 ALTER TABLE `table_show_time` DISABLE KEYS */;
INSERT INTO `table_show_time` VALUES (1,'4','10:30'),(2,'4','1:30'),(3,'4','15:30'),(4,'4','18:30'),(5,'4','21:30'),(6,'5','10:30'),(7,'5','1:30'),(8,'5','15:30'),(9,'5','18:30'),(10,'5','21:30'),(11,'6','10:30'),(12,'6','1:30'),(13,'6','15:30'),(14,'6','18:30'),(15,'6','21:30'),(16,'7','10:30'),(17,'7','1:30'),(18,'7','15:30'),(19,'7','18:30'),(20,'7','21:30'),(21,'8','10:30'),(22,'8','1:30'),(23,'8','15:30'),(24,'8','18:30'),(25,'8','21:30'),(26,'9','10:30'),(27,'9','1:30'),(28,'9','15:30'),(29,'9','18:30'),(30,'9','21:30');
/*!40000 ALTER TABLE `table_show_time` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-10 20:16:23
