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
-- Table structure for table `stockdeliveryorders`
--

DROP TABLE IF EXISTS `stockdeliveryorders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stockdeliveryorders` (
  `idstockdeliveryorders` int(11) NOT NULL,
  `stockDeliveryDateReceived` varchar(45) DEFAULT NULL,
  `supplierName` varchar(45) DEFAULT NULL,
  `supplierTelephoneNumber` varchar(45) DEFAULT NULL,
  `supplierEmail` varchar(45) DEFAULT NULL,
  `supplierMethodOfContact` varchar(45) DEFAULT NULL,
  `supplierAddress` varchar(145) DEFAULT NULL,
  `orderStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idstockdeliveryorders`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stockdeliveryorders`
--

LOCK TABLES `stockdeliveryorders` WRITE;
/*!40000 ALTER TABLE `stockdeliveryorders` DISABLE KEYS */;
INSERT INTO `stockdeliveryorders` VALUES (1,'29/09/2015','GardenGnomeManufacturers','07453255682','GgnomeMan@gmail.com','Email','109 LimeTreeAvenue, Salford,Manchester,M503Ah','AVAILABLE'),(2,'29/09/2015','WholesaleGardenGnomes','07451233126','Wgnome@hotmail.com','Telephone','442 BachelorWay, Clifton, Bristol, BS81AS','AVAILABLE'),(3,'30/09/2015','GnomeMakers','07452117434','GM@outlook.com','Mail','303 Test Way, Oxford, OA92BS','AVAILABLE'),(4,'01/10/2015','CcooperGnomes','07917800649','ccooper@netbuilder.com','Email','1 Anchorage, Salford Quays, Manchester M50 AH','AVAILABLE'),(5,'01/10/2015','readingGnomes','07893563247','readingGnomesLTD@gmail.com','Telephone','ReadingIndustrialPark,Reading,RE374SD','AVAILABLE'),(6,'01/10/2015','Gnomes','07897600654','gnomes@hotmail.com','email','3BoomCloseLondonLDNEAH','AVAILABLE'),(7,'01/10/2015','NBGnomeSuppliers','07563242343','NB@netbuilder.com','Email','1 Anchorage, Salford Quays, Manchester','AVAILABLE'),(8,'01/10/2015','ManchesterGnomes','01348 823456','man@gmail.com','Email','112 Media City Uk, Salford, Manchester, MCR 9IK','AVAILABLE'),(9,'02/10/2015','GnomeManufacturer','092345455456','gnoma@hotmail.com','Email','109 gsdf road, ','AVAILABLE'),(10,'02/10/2015','BigMassiveGnomeFactory','07845333275','bigGnomes@googlemail.com','Telephone','112 Gnome Road, London, LDN 5FD','AVAILABLE'),(11,'06/11/2015','CallumCooperGnomesLTD','01480 470123','ccGnomes@gmail.com','Email','112 Business Park, St Neots, Cambridgeshire, PE19 2AH','AVAILABLE'),(12,'10/11/2015','NBGARDENS','01480456765','nbGardens@hotmail.com','Telephone','1 Anchorage, Salford, Manchester, M5AH','AVAILABLE'),(13,'10/11/2015','LondonGnomes','0736256326','gnomes@hotmail.com','Email','109 road, BusinessPark, London, LDN5AH','AVAILABLE'),(14,'11/11/2015','DummyGnomes','07643266432','email@email.com','Email','109 Balaclough Road, Liverpool, LPL78J','CHECKED OUT');
/*!40000 ALTER TABLE `stockdeliveryorders` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-16 16:03:00
