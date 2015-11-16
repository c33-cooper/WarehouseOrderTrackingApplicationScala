-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: warehousedatabase
-- ------------------------------------------------------
-- Server version	5.6.27-log

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
-- Table structure for table `stockdeliveryorderline`
--

DROP TABLE IF EXISTS `stockdeliveryorderline`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stockdeliveryorderline` (
  `idstockdeliveryorderline` int(11) NOT NULL,
  `idstockdeliveryorders` int(11) DEFAULT NULL,
  `idproducts` int(11) DEFAULT NULL,
  `productQuantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`idstockdeliveryorderline`),
  KEY `stockdeliveryorder_idx` (`idstockdeliveryorders`),
  KEY `product_idx` (`idproducts`),
  CONSTRAINT `products` FOREIGN KEY (`idproducts`) REFERENCES `products` (`idproducts`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `stockdeliveryorder` FOREIGN KEY (`idstockdeliveryorders`) REFERENCES `stockdeliveryorders` (`idstockdeliveryorders`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stockdeliveryorderline`
--

LOCK TABLES `stockdeliveryorderline` WRITE;
/*!40000 ALTER TABLE `stockdeliveryorderline` DISABLE KEYS */;
INSERT INTO `stockdeliveryorderline` VALUES (1,1,5,100),(2,1,1,100),(3,2,3,123),(4,2,2,1000),(5,2,2,11),(6,3,4,100),(7,3,6,14),(8,4,5,34),(9,5,6,12),(10,5,2,1),(11,6,6,100),(12,7,11,200),(13,8,16,400),(14,9,19,70),(15,10,10,80),(16,11,8,40),(17,12,3,6000),(18,13,20,90),(19,14,19,20);
/*!40000 ALTER TABLE `stockdeliveryorderline` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-16 16:02:59
