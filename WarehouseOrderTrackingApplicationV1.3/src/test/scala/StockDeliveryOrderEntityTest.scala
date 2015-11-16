

import com.qa.entities.StockDeliveryOrderEntity

/**
 * @author callum
 * @description StockDeliveryOrderEntityTest.scala is the test class for 
 *              StockDeliveryOrderEntity.scala.
 */
class StockDeliveryOrderEntityTest extends TestBase {
  
  /**
   * Test id stock delivery orders
   */
  def idStockDeliveryOrdersTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid id stock
      delivery order with a valid Integer""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(1, 
             null, null, null, null, null, null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.idStockDeliveryOrders.value should be (1)
      }
  }
  
  /**
   * Test order date stock delivery orders
   */
  def stockDeliverOrderDateReceivedTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid order date
      received with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             "12/05/1993", null, null, null, null, null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.stockDeliverOrderDateReceived.value should be ("12/05/1993")
      }
  }
  
  /**
   * Test order date stock delivery orders
   */
  def stockDeliverOrderSupplierNameTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      name with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, "NBGnomes", null, null, null, null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.supplierName.value should be ("NBGnomes")
      }
  }
  
  /**
   * Test telephone number stock delivery orders
   */
  def stockDeliverOrderSupplierTelephoneNumberTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      telephone number with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, null, "07563225439", null, null, null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.supplierTelephoneNumber.value should be ("07563225439")
      }
  }
  
  /**
   * Test email stock delivery orders
   */
  def stockDeliverOrderSupplierEmailTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      email with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, null, null, "Callum.Cooper@qa.com", null, null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.supplierEmail.value should be ("Callum.Cooper@qa.com")
      }
  }
  
  /**
   * Test method of contact stock delivery orders
   */
  def stockDeliverOrderMethodOfContactTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      method of contact with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, null, null, null, "Email", null, null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.supplierMethodOfContact.value should be ("Email")
      }
  }
  
  /**
   * Test supplier address stock delivery orders
   */
  def stockDeliverOrderSupplierAddressTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      address with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, null, null, null, null, "1 Anchorage, Salford, Manchester", null)
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.supplierAddress.value should be ("1 Anchorage, Salford, Manchester")
      }
  }
  
  /**
   * Test supplier address stock delivery orders
   */
  def stockDeliverOrderStatusTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      orderStatus with a valid String""" in
      {
         // Create object and run test
         val stockDeliveryOrderEntity : StockDeliveryOrderEntity = new StockDeliveryOrderEntity(0, 
             null, null, null, null, null, null, "Dispatched")
         
         // access the id stock delivery order
         stockDeliveryOrderEntity.orderStatus.value should be ("Dispatched")
      }
  }
  
  // Call tests
  idStockDeliveryOrdersTest
  stockDeliverOrderDateReceivedTest
  stockDeliverOrderSupplierNameTest
  stockDeliverOrderSupplierTelephoneNumberTest
  stockDeliverOrderSupplierEmailTest
  stockDeliverOrderMethodOfContactTest
  stockDeliverOrderSupplierAddressTest
  stockDeliverOrderStatusTest
}