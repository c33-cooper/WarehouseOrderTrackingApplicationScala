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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `idproducts` int(11) NOT NULL,
  `productName` varchar(45) DEFAULT NULL,
  `productDescription` varchar(45) DEFAULT NULL,
  `productType` varchar(45) DEFAULT NULL,
  `productCost` double DEFAULT NULL,
  `canHavePorousWare` varchar(45) DEFAULT NULL,
  `productDiscontinued` varchar(45) DEFAULT NULL,
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  PRIMARY KEY (`idproducts`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'GardenGnome','LooksLikeAGnome','Gnome',1.52,'yes','no',160,20),(2,'AinsleyHarrietGnome','FoundRubbingMeat','SpicyBwoiGnome',50.36,'no','no',60,20),(3,'Jacuzzi','LargeJacuzziBathForGnomes','GnomeAccessories',120.19,'yes','yes',20,20),(4,'TestGnome','TestingGnome','Gnome',10.13,'no','no',200,40),(5,'LionelMessiGnome','FootballGnome','Football',6.86,'yes','no',100,40),(6,'GardenSunDial','SunDialForTheGarden','GardenAccessories',12.11,'no','no',180,60),(7,'ZombieGnome','HalloweenSeasonal','GardenAccessories',19.21,'no','no',120,80),(8,'GameOfGnomes','Television','Gnome',13.45,'no','no',60,80),(9,'ThumbsUpNingaGnome','Seasonal','Gnome',18.67,'yes','no',180,100),(10,'MUFCGnome','BestTeamInTheWorld','Sports',1000,'yes','no',100,120),(11,'WoodlandWilfGnome','FishingGnome','Outdoors',12.67,'no','no',40,120),(12,'MushroomGnome','FungusGnome','Outdoors',9.56,'yes','no',140,140),(13,'ThroneGnome','ToiletGnome','Indoors',5.67,'yes','no',200,160),(14,'RockeryGnome','GardenGnome','Outdoors',16.87,'yes','no',100,160),(15,'BigMouthGnome','HappyGnome','Kitchenwear',11.86,'no','no',20,160),(16,'MafiaGnome','GangsterGnome','Italian',7.65,'no','no',140,180),(17,'FedoraGnome','HatGnome','Clothing',8.65,'yes','no',80,180),(18,'CricketGnome','BatGnome','Sports',3.45,'yes','no',180,200),(19,'FootballGnome','KickingGnome','Sports',8.9,'no','no',60,200),(20,'GardenXPGnome','Garden','XP',34.56,'no','no',70,110);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
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
