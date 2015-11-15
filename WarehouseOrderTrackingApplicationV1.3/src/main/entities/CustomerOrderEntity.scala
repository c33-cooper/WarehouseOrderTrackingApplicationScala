/**
 * Imports
 */
import scalafx.beans.property.ObjectProperty
import scalafx.beans.property.BooleanProperty
import scalafx.beans.property.DoubleProperty

/**
 * @author callum
 * @description CustomerOrderEntity.scala is an entity class
 *              for holding attributes for the customer order
 */
class CustomerOrderEntity(val idOrders_ : Int, val orderDateCreated_ : String,
                          val orderVerified_ : Boolean, val orderTotal_ : Double,
                          val productQuantity_ : Int, val orderStatus_ : String){
  
  // Entity attributes
  val idOrders = new ObjectProperty[Int](this, "idOrders", idOrders_)
  val orderDateCreated = new ObjectProperty[String](this, "orderDateCreated", orderDateCreated_)
  val orderVerified = new ObjectProperty[Boolean](this, "orderVerified", orderVerified_)
  val orderTotal = new ObjectProperty[Double](this, "orderTotal", orderTotal_)
  val productQuantity = new ObjectProperty[Int](this, "productQuantity", productQuantity_)
  val orderStatus = new ObjectProperty[String](this, "orderStatus", orderStatus_)
}