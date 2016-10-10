package acme

import logging.Logger

class Store(initialStock: Int) extends Logger {
  private var inStock = 0
  widgetsInStock = initialStock

  // properties (getters and setters)
  def widgetsInStock = inStock
  def widgetsInStock_=(newValue: Int) = {
    require(newValue >= 0, "Out of stock!")
    inStock = newValue
  }

  def order(numWidgets: Int) =  {
    log("Order arrived...")
    widgetsInStock -= numWidgets
    log(s"Order complete -- widgets in stock: $widgetsInStock")
  }
}
