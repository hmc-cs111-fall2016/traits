package acme

import logging._

class Store(initialStock: Int) extends ColoredConsoleLogger 
                                  with Debugging 
                                  with TimestampLogger 
                                  with LowercaseLogger {
  private var inStock = 0
  widgetsInStock = initialStock

  // properties (getters and setters)
  def widgetsInStock = inStock
  def widgetsInStock_=(newValue: Int) = {
    debug("called `widgetsInStock` property")
    require(newValue >= 0, "Out of stock!")
    inStock = newValue
  }

  def order(numWidgets: Int) =  {
    info("Order arrived...")
    widgetsInStock -= numWidgets
    info(s"Order complete -- widgets in stock: $widgetsInStock")
  }
}
