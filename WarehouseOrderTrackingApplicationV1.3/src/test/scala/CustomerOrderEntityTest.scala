import com.qa.entities.CustomerOrderEntity

/**
 * @author callum
 * @description CustomerOrderEntityTest.scala is the test class for 
 *              CustomerOrderEntity.scala.
 */
class CustomerOrderEntityTest extends TestBase{
 /**
   * Test id orders
   */
  def idOrdersTest(){
    "By Initialising the Customer Order Entity it" should """set a valid id order with a valid Integer""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(1, 
             null, false, 0, 0, null)
         
         // access the id order
         CustomerOrderEntity.idOrders.value should be (1)
      }
  }
  
  /**
   * Test order date created
   */
  def orderDateCreatedTest(){
    "By Initialising the Customer Order Entity it" should """set a valid order date
      created with a valid String""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(0, 
             "12/05/1993", false, 0, 0, null)
         
         // access the order date created
         CustomerOrderEntity.orderDateCreated.value should be ("12/05/1993")
      }
  }
  
  /**
   * Test order verified
   */
  def orderVerifiedTest(){
    "By Initialising the Customer Order Entity it" should """set a valid order verified
      created with a valid Boolean""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(0, 
             null, true, 0, 0, null)
         
         // access the order verified
         CustomerOrderEntity.orderVerified.value should be (true)
      }
  }
  
  /**
   * Test order total
   */
  def orderTotalTest(){
    "By Initialising the Customer Order Entity it" should """set a valid order total
       with a valid Integer""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(0, 
             null, false, 15, 0, null)
         
         // access the order total
         CustomerOrderEntity.orderTotal.value should be (15)
      }
  }
  
  /**
   * Test productQuantity
   */
  def productQuantityTest(){
    "By Initialising the Customer Order Entity it" should """set a valid product quantity
       with a valid Integer""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(0, 
             null, false, 0, 51, null)
         
         // access the product quantity
         CustomerOrderEntity.productQuantity.value should be (51)
      }
  }
  
  /**
   * Test orderStatus
   */
  def orderStatusTest(){
    "By Initialising the Stock Delivery Order Entity it" should """set a valid supplier
      method of contact with a valid String""" in
      {
         // Create object and run test
         val CustomerOrderEntity : CustomerOrderEntity = new CustomerOrderEntity(0, 
             null, false, 0, 0, "Available")
         
         // access the order status
         CustomerOrderEntity.orderStatus.value should be ("Available")
      }
  }

  // Call tests
  idOrdersTest()
  orderDateCreatedTest()
  orderVerifiedTest()
  orderTotalTest()
  productQuantityTest()
  orderStatusTest()
}