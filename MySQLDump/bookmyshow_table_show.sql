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
-- Table structure for table `table_show`
--

DROP TABLE IF EXISTS `table_show`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `table_show` (
  `show_id` bigint NOT NULL,
  `show_time` varchar(255) NOT NULL,
  `the_movie_m_id` bigint DEFAULT NULL,
  `the_theater_t_id` bigint DEFAULT NULL,
  PRIMARY KEY (`show_id`),
  KEY `FKsayo2xxw82i3o8h7twmmps3um` (`the_movie_m_id`),
  KEY `FKeg2ca18ko9iie9lo3h6ay2ury` (`the_theater_t_id`),
  CONSTRAINT `FKeg2ca18ko9iie9lo3h6ay2ury` FOREIGN KEY (`the_theater_t_id`) REFERENCES `table_theater` (`t_id`),
  CONSTRAINT `FKsayo2xxw82i3o8h7twmmps3um` FOREIGN KEY (`the_movie_m_id`) REFERENCES `table_movie` (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `table_show`
--

LOCK TABLES `table_show` WRITE;
/*!40000 ALTER TABLE `table_show` DISABLE KEYS */;
INSERT INTO `table_show` VALUES (12,'09/11/2022 - 09:00 AM',10,4),(13,'09/11/2022 - 12:00 PM',10,4),(14,'10/11/2022 - 03:00 PM',10,4),(15,'10/11/2022 - 06:00 PM',10,4),(16,'10/11/2022 - 09:00 PM',10,4),(17,'11/11/2022 - 3:00 PM',11,4),(18,'11/11/2022 - 9:00 PM',11,4),(19,'11/11/2022 - 9:00 AM',10,5),(20,'12/11/2022 - 9:00 PM',10,5),(21,'12/11/2022 - 9:00 PM',10,6),(22,'12/11/2022 - 9:00 PM',10,7),(23,'12/11/2022 - 9:00 PM',10,8),(24,'12/11/2022 - 3:00 PM',10,9),(25,'12/11/2022 - 6:00 PM',11,9),(26,'12/11/2022 - 6:00 PM',11,8),(27,'12/11/2022 - 6:00 PM',11,7),(28,'12/11/2022 - 6:00 PM',11,6),(29,'12/11/2022 - 6:00 PM',11,5),(30,'12/11/2022 - 6:00 PM',11,4),(32,'12/11/2022 - 6:00 PM',10,9),(33,'12/11/2022 - 6:00 PM',10,9),(34,'12/11/2022 - 6:00 PM',10,4),(35,'12/11/2022 - 6:00 PM',10,5),(36,'12/11/2022 - 6:00 PM',10,6);
/*!40000 ALTER TABLE `table_show` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-10 20:16:22
