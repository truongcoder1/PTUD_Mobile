-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: QLSV
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
  `OOP` char(1) NOT NULL,
  `PM` char(1) NOT NULL,
  `ML` char(1) NOT NULL,
  `DB` char(1) NOT NULL,
  `Mobile` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbsv`
--

LOCK TABLES `tbsv` WRITE;
/*!40000 ALTER TABLE `tbsv` DISABLE KEYS */;
INSERT INTO `tbsv` VALUES ('Nguyen','Van A','2002-03-15','Ha Noi','CNTT','A','A','B','C','C'),('Tran','Thi B','2001-07-22','Hai Phong','HTTT','B','C','C','B','A'),('Le','Van C','2003-01-10','Da Nang','KTPM','C','C','A','A','B'),('Pham','Thi D','2002-11-30','TP. HCM','TTNT','D','D','B','C','C'),('Hoang','Van E','2000-05-25','Hue','CNTT','A','B','B','B','A'),('Do','Thi F','2001-08-18','Can Tho','HTTT','C','C','C','A','D'),('Bui','Van G','2002-12-05','Binh Dinh','KTPM','B','B','B','B','C'),('Ngo','Thi H','2000-06-14','Nha Trang','TTNT','F','F','D','D','C'),('Ly','Van I','2001-10-30','Bac Ninh','CNTT','D','D','C','C','C'),('Phan','Thi K','2003-02-20','Da Lat','HTTT','A','A','A','B','B'),('Vu','Van M','2002-04-12','Nam Dinh','KTPM','B','C','B','B','B'),('Trinh','Thi N','2001-07-25','Quang Ninh','TTNT','C','D','D','D','C'),('Dinh','Van P','2003-11-05','Hai Duong','CNTT','F','F','C','C','B'),('Luong','Thi Q','2002-09-14','Thanh Hoa','HTTT','B','B','B','C','C'),('Kim','Van R','2001-12-30','Binh Duong','KTPM','D','D','D','A','A'),('Han','Thi S','2000-08-19','Vinh','TTNT','C','C','B','B','B'),('Cao','Van T','2002-05-28','Dong Nai','CNTT','A','A','C','C','D'),('Luu','Thi U','2001-11-11','Tien Giang','HTTT','F','F','D','D','C'),('Tung','Van V','2003-06-07','Ben Tre','KTPM','C','C','C','B','B'),('Quach','Thi X','2002-01-22','Phu Yen','TTNT','B','B','A','A','C');
/*!40000 ALTER TABLE `tbsv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'QLSV'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-18 15:01:29
