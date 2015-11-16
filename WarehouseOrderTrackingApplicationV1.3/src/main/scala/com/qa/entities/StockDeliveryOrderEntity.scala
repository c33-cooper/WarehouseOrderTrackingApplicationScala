package com.qa.entities

import scalafx.beans.property.ObjectProperty

/**
 * @author callum
 * @description StockDeliveryOrderEntity.scala is an entity class
 *              for holding attributes for the stock delivery orders.
 */
class StockDeliveryOrderEntity(val idStockDeliveryOrders_ : Int, val stockDeliverOrderDateReceived_ : String,
    val supplierName_ : String, val supplierTelephoneNumber_ : String,
    val supplierEmail_ : String, val supplierMethodOfContact_ : String, 
    val supplierAddress_ : String, val orderStatus_ : String) {
  
  // Entity attributes
  val idStockDeliveryOrders = new ObjectProperty[Int](this, "idStockDeliveryOrders", idStockDeliveryOrders_)
  val stockDeliverOrderDateReceived = new ObjectProperty[String](this, "stockDeliverOrderDateReceived", stockDeliverOrderDateReceived_)
  val supplierName = new ObjectProperty[String](this, "supplierName", supplierName_)
  val supplierTelephoneNumber = new ObjectProperty[String](this, "supplierTelephoneNumber", supplierTelephoneNumber_)
  val supplierEmail = new ObjectProperty[String](this, "supplierEmail", supplierEmail_)
  val supplierMethodOfContact = new ObjectProperty[String](this, "supplierMethodOfContact", supplierMethodOfContact_)
  val supplierAddress = new ObjectProperty[String](this, "supplierAddress", supplierAddress_)
  val orderStatus = new ObjectProperty[String](this, "orderStatus", orderStatus_)
  
}