-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: qlsv
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbsv`
--

DROP TABLE IF EXISTS `tbsv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbsv` (
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `BirthDate` date NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Class` varchar(100) NOT NULL,
  `OOP` float NOT NULL,
  `PM` float NOT NULL,
  `ML` float NOT NULL,
  `DB` float NOT NULL,
  `Mobile` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbsv`
--

LOCK TABLES `tbsv` WRITE;
/*!40000 ALTER TABLE `tbsv` DISABLE KEYS */;
INSERT INTO `tbsv` VALUES ('Nguyen','Van A','2002-03-15','Ha Noi','CNTT',8.5,7.2,9,6.8,7.5),('Tran','Thi B','2001-07-22','Hai Phong','HTTT',6.5,8.1,7.3,5.9,9),('Le','Van C','2003-01-10','Da Nang','KTPM',7.8,6.9,8.4,7.2,6.5),('Pham','Thi D','2002-11-30','TP. HCM','TTNT',9.2,8.7,7,6.4,7.8),('Hoang','Van E','2000-05-25','Hue','CNTT',5.4,6.8,7.5,8,9.1),('Do','Thi F','2001-08-18','Can Tho','HTTT',7.1,8.2,6.3,7.8,8.5),('Bui','Van G','2002-12-05','Binh Dinh','KTPM',8,7.7,9.2,6.1,5.6),('Ngo','Thi H','2000-06-14','Nha Trang','TTNT',6.9,5.5,8,7.4,7.2),('Ly','Van I','2001-10-30','Bac Ninh','CNTT',7.3,6.5,7.8,9,8.2),('Phan','Thi K','2003-02-20','Da Lat','HTTT',5.8,7.2,6.9,8.4,7.7),('Vu','Van M','2002-04-12','Nam Dinh','KTPM',9.5,8.1,6.8,7.3,6.9),('Trinh','Thi N','2001-07-25','Quang Ninh','TTNT',6,7.5,8.8,7.1,5.9),('Dinh','Van P','2003-11-05','Hai Duong','CNTT',8.7,7.6,9.1,6.2,7.4),('Luong','Thi Q','2002-09-14','Thanh Hoa','HTTT',7.2,6.8,5.5,8,9.3),('Kim','Van R','2001-12-30','Binh Duong','KTPM',6.4,8.5,7.9,6.7,5.8),('Han','Thi S','2000-08-19','Vinh','TTNT',9,7.3,6.4,8.2,7.6),('Cao','Van T','2002-05-28','Dong Nai','CNTT',5.6,6.9,7.2,8.1,7),('Luu','Thi U','2001-11-11','Tien Giang','HTTT',7.8,8.9,6.5,7.4,5.6),('Tung','Van V','2003-06-07','Ben Tre','KTPM',6.2,5.7,8.3,7.9,6.8),('Quach','Thi X','2002-01-22','Phu Yen','TTNT',8.3,7.5,6.9,9.2,7.1);
/*!40000 ALTER TABLE `tbsv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'qlsv'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-18 20:24:08
