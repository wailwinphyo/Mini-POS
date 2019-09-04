-- MariaDB dump 10.17  Distrib 10.4.7-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: pos_wlp
-- ------------------------------------------------------
-- Server version	10.4.7-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Food',NULL),(2,'Drink',NULL),(3,'Medicine',NULL),(4,'Stationary','');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'Cheese Burger','FD-101',13,300,1),(2,'Sandwich','FD-102',41,800,1),(3,'Coca-Cola','DK-101',23,600,2),(4,'Soda','DK-102',14,300,2),(5,'Hot Dog','FD-103',10,500,1),(6,'Pesi-Cola','DK-103',11,600,2),(7,'Pancil','SN-101',14,250,4),(8,'Note Book','SN-102',7,600,4),(9,'Ball Pen','SN-105',8,300,4),(10,'Pocari Sweat','DK-104',13,900,2),(11,'Biogesic','MD-101',9,500,3),(12,'Mixagrip','MD-102',10,600,3),(13,'Vicee','MD-104',12,300,3),(14,'Strepsils','MD-103',18,500,3),(15,'Ruler','SN-103',0,200,4);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `stock_transactions`
--

LOCK TABLES `stock_transactions` WRITE;
/*!40000 ALTER TABLE `stock_transactions` DISABLE KEYS */;
INSERT INTO `stock_transactions` VALUES (1,-4,'Stock Insertion',1567336956282,3,100,2),(2,-2,'Stock Insertion',1567336956491,1,1500,2),(3,2,'Stock Insertion',1567349698551,1,2000,2),(4,-3,'Stock Insertion',1567350673011,2,1000,2),(5,-4,'Stock Insertion',1567350673393,1,2000,2),(6,4,'Stock Insertion',1567351178217,5,200,2),(7,3,'Stock Insertion',1567351186022,4,200,2),(8,6,'Stock Insertion',1567351269511,1,1500,2),(9,10,'Stock Insertion',1567351276876,2,1500,2),(10,10,'Stock Insertion',1567351281953,1,1500,2),(11,10,'Stock Insertion',1567535802310,8,600,3),(12,8,'Stock Insertion',1567535884393,7,300,2),(13,4,'Stock Insertion',1567535915730,5,300,2),(14,7,'Stock Insertion',1567535991044,2,450,3),(15,-3,'Stock Insertion',1567536056116,7,300,3),(16,-3,'Stock Insertion',1567536056243,8,600,5),(17,-4,'Stock Insertion',1567536264124,6,500,5),(18,-2,'Stock Insertion',1567536264211,2,450,5),(19,-3,'Stock Insertion',1567536349868,3,100,2),(20,5,'Stock Insertion',1567538208038,6,400,1),(21,-1,'Stock Insertion',1567538887433,6,400,2),(22,-2,'Stock Insertion',1567538887535,2,450,2),(23,-1,'Stock Insertion',1567538910541,6,400,2),(24,-2,'Stock Insertion',1567538910737,2,450,2),(25,-3,'Stock Insertion',1567538910826,4,200,2),(26,-1,'Stock Insertion',1567538917899,6,400,2),(27,-2,'Stock Insertion',1567538917980,2,450,2),(28,-3,'Stock Insertion',1567538918048,4,200,2),(29,-1,'Stock Insertion',1567538934354,6,400,2),(30,-2,'Stock Insertion',1567538934437,2,450,2),(31,-3,'Stock Insertion',1567538934505,4,200,2),(32,-2,'Stock Insertion',1567538934662,5,300,2),(33,-3,'Stock Insertion',1567539074552,2,450,5),(34,-5,'Stock Insertion',1567539359559,1,1500,3),(35,20,'Stock Insertion',1567539424884,4,300,3),(36,18,'Stock Insertion',1567539438498,6,200,3),(37,0,'Stock Insertion',1567539472505,6,600,3),(38,8,'Stock Insertion',1567619764674,9,300,5),(39,-4,'Stock Insertion',1567619797993,6,600,5),(40,-5,'Stock Insertion',1567619798129,1,1500,5),(41,11,'Stock Insertion',1567619834824,1,1000,5),(42,9,'Stock Insertion',1567620257568,11,500,5),(43,11,'Stock Insertion',1567620269810,12,600,5),(44,12,'Stock Insertion',1567620281486,13,300,5),(45,20,'Stock Insertion',1567620322851,14,500,5),(46,-1,'Stock Insertion',1567620359668,1,1000,5),(47,-1,'Stock Insertion',1567620359803,12,600,5),(48,-2,'Stock Insertion',1567620359893,14,500,5),(49,-2,'Stock Insertion',1567620526912,5,300,5),(50,15,'Stock Insertion',1567620578351,10,900,5),(51,40,'Stock Insertion',1567620603320,2,800,5),(52,10,'Stock Insertion',1567620641369,5,500,5),(53,20,'Stock Insertion',1567620662631,3,600,5),(54,10,'Stock Insertion',1567620681365,7,250,5),(55,-2,'Stock Insertion',1567620739081,10,900,5),(56,-1,'Stock Insertion',1567620739237,7,250,5),(57,-2,'Stock Insertion',1567620739303,5,500,5),(58,-1,'Stock Insertion',1567621685042,1,1000,2),(59,4,'Stock Insertion',1567624443970,1,300,1);
/*!40000 ALTER TABLE `stock_transactions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_types`
--

LOCK TABLES `user_types` WRITE;
/*!40000 ALTER TABLE `user_types` DISABLE KEYS */;
INSERT INTO `user_types` VALUES (1,'System Admin','ROLE_ADMIN'),(2,'Cashier','ROLE_CASHIER');
/*!40000 ALTER TABLE `user_types` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Adminstrator','admin','admin','1'),(2,'Aye Aye','ayeaye','aye','2'),(3,'Aung Aung','aungaung','aung','2'),(5,'Kyaw Kyaw','kyawkyaw','kyaw','2');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-05  2:15:14
