CREATE DATABASE  IF NOT EXISTS `bus` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bus`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: bus
-- ------------------------------------------------------
-- Server version	5.5.24

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
-- Table structure for table `create1`
--

DROP TABLE IF EXISTS `create1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `create1` (
  `ename` varchar(45) NOT NULL,
  `egender` varchar(6) NOT NULL,
  `emob` varchar(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `epass` varchar(10) NOT NULL,
  PRIMARY KEY (`emob`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `create1`
--

LOCK TABLES `create1` WRITE;
/*!40000 ALTER TABLE `create1` DISABLE KEYS */;
INSERT INTO `create1` VALUES ('prince shama','Male','7777884874','prince@gmail.com','n@ncy'),('Abhijeet Pandey','Male','8181945624','abhijeetpandey2837@gmail.com','abhi');
/*!40000 ALTER TABLE `create1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `busid`
--

DROP TABLE IF EXISTS `busid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `busid` (
  `esource` varchar(20) NOT NULL,
  `edestination` varchar(20) NOT NULL,
  `eid` varchar(10) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `busid`
--

LOCK TABLES `busid` WRITE;
/*!40000 ALTER TABLE `busid` DISABLE KEYS */;
INSERT INTO `busid` VALUES ('Delhi','Jaipur','ET909'),('Jaipur','Hyderbad','FH990'),('Hyderbad','Delhi','FL888'),('Mumbai','Delhi','FX123'),('Mumbai','Kolkata','FX543'),('Jaipur','Delhi','IL098'),('Kolkata','Jaipur','JJ878'),('Hyderbad','Jaipur','KK999'),('Lucknow','Delhi','LK989'),('Jaipur','Mumbai','MJ222'),('Jaipur','Lucknow','OK909'),('Hyderbad','Lucknow','OO999'),('Kolkata','Mumbai','OP677'),('Kolkata','Delhi','PK001'),('Hyderbad','Kolkata','PL900'),('Hyderbad','Mumbai','PP888'),('Mumbai','Jaipur','RR887'),('Hyderbad','Jabalpur','SK999'),('Mumbai','Jabalpur','SR999'),('Kolkata','Jabalpur','UU880'),('Delhi','Hyderbad','VV778'),('Kolkata','Hyderbad','WQ677'),('Jaipur','Kolkata','WR001'),('Delhi','Mumbai','WX999'),('Jabalpur','Kolkata','XX707'),('Delhi','Kolkata','YF765');
/*!40000 ALTER TABLE `busid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `ename` varchar(15) NOT NULL,
  `epassword` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`ename`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `BID` int(11) NOT NULL,
  `esource` varchar(30) NOT NULL,
  `edestination` varchar(30) NOT NULL,
  `edate` date NOT NULL,
  `ebus` varchar(10) NOT NULL,
  `eseat` varchar(10) DEFAULT NULL,
  `ename` varchar(15) DEFAULT NULL,
  `eid` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,'Mumbai','Delhi','2019-09-04','A.C.','2,1','prince','FX123'),(2,'Mumbai','Kolkata','2019-09-13','A.C.','1,2,4','po','FX543'),(3,'Mumbai','Kolkata','2019-09-13','A.C.','6,3','po','FX543'),(4,'Mumbai','Delhi','2019-09-04','A.C.','4,6','polo','FX123'),(5,'Mumbai','Kolkata','2019-09-13','Non A.C.','4,5','prince','FX543'),(6,'Mumbai','Delhi','2019-09-14','A.C.','4,1,2','prince sharma','FX123'),(7,'Mumbai','Kolkata','2019-09-13','A.C.','8,7','nancy','FX543'),(8,'Mumbai','Delhi','2019-09-12','A.C.','1,2','nancy','FX123'),(9,'Mumbai','Delhi','2019-09-12','A.C.','4,3','prince','FX123'),(10,'Hyderbad','Mumbai','2019-09-06','A.C.','6,21','prince','PP888'),(11,'Hyderbad','Jabalpur','2019-09-21','Non A.C.','16,15,18','','SK999');
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-08  0:05:06
