# WarehouseOrderTrackingApplicationScala

WarehouseOrderTrackingApplication V1.1, V1.2, V1.3

Application requires scala 2.11.7 with ScalaFX 2.11 to run, SQL Database scripts have been included to build correct tables for the Database. Scripts include 

warehousedatabase_stockdeliveryorders.sql
warehousedatabase_stockdeliveryorderline.sql
warehousedatabase_products.sql
warehousedatabase_orders.sql
warehousedatabase_orderline.sql
warehousedatabase_inventory.sql
warehousedatabase_employees.sql

All tables are required to be built into an SQL Database name "warehousedatabase" with a valid connection.
The connection username = root, password = password.

Also all employee logins are encrypted using the MD5 encryption, a list of valid logins are as follows:
BenBack - armyLad212
AlStock - theGaffer
DebbieThorne - HRLass
JohnMann - ChiefOps
AndrewHerbison - WarehouseMan
TarumaPatel - CallsAllDay
ChrisCorder - CorderMan
AdaLillies - Coder
SysAdmin - pigsInBlankets

Maven Dependencies :

Scala Test 2.2.5
<dependency>
		<groupId>org.scalatest</groupId>
		<artifactId>scalatest_2.11</artifactId>
		<version>2.2.5</version>
		<scope>test</scope>
</dependency>

Apache Maven 3.3
<plugin>
	    <groupId>org.apache.maven.plugins</groupId>
	    <artifactId>maven-compiler-plugin</artifactId>
	    <version>3.3</version>
	    <configuration>
	        <source>1.8</source>
	        <target>1.8</target>
	    </configuration>
</plugin>

Scalafx 2.11
<dependency>
		<groupId>org.scalafx</groupId>
		<artifactId>scalafx_2.11</artifactId>
		<version>8.0.60-R9</version>
</dependency>
