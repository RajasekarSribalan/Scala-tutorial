import scala.io.Source

object OrderRevenue {

  def main(args: Array[String]) = {
    
    val orderId = args(1).toInt;

    val orderItems = Source.fromFile("/home/hduser/itversity_data/data/retail_db/order_items/part-00000").getLines();

    val orderItemsFilter = orderItems.filter(eachOrder => eachOrder.split(",")(1).toInt == orderId)
    
    val orderItemsMap = orderItemsFilter.map(orderItem => orderItem.split(",")(4).toFloat)
    
    val outPut = orderItemsMap.reduce((sum,eachOrderAmount) => sum + eachOrderAmount)
    
    print(outPut);
  }

}