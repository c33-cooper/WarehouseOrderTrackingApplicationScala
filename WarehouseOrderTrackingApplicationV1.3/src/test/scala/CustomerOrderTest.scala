

/**
 * @author callum
 * @description CustomerOrderTest.scala is the test class for
 *              CustomerOrder.scala
 */
class CustomerOrderTest extends TestBase{
  
  /**
   * Test establish customer orders
   */
  def establishCustomerOrdersTest {
    "Calling Establish Customer Orders" should "return an Observable Buffer of orders that is not null" in
    {
      // Create an object and run test
      val customerOrder : CustomerOrder = new CustomerOrder
      customerOrder.establishCustomerOrders should not be (null)
    }
    it should "return an Observable Buffer of length that matches Customer Orders Table" in
    {
      // Create an object and run test
      val customerOrder : CustomerOrder = new CustomerOrder
      customerOrder.establishCustomerOrders.length should be (5)
    }
  }
  it should "return an Observable Buffer with valid idorders from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).idOrders.value should be (1)
  }
  it should "return an Observable Buffer with valid orderDateCreated from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).orderDateCreated.value should be ("24/09/2015")
  }
  it should "return an Observable Buffer with valid orderVerified from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).orderVerified.value should be (false)
  }
  it should "return an Observable Buffer with valid orderTotal from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).orderTotal.value should be (5.57)
  }
  it should "return an Observable Buffer with valid productQuantity from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).productQuantity.value should be (2)
  }
  it should "return an Observable Buffer with valid orderStatus from Customer Orders Table" in
  {
    // Create an object and run test
    val customerOrder : CustomerOrder = new CustomerOrder
    customerOrder.establishCustomerOrders.apply(0).orderStatus.value should be ("DISPATCHED")
  }
  
  // Run tests
  establishCustomerOrdersTest
}